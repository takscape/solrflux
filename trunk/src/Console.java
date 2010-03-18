import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.input.CharSequenceReader;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;
import net.moraleboost.solrql.eval.Statement;
import net.moraleboost.solrql.eval.stmt.SelectStatement;
import net.moraleboost.solrql.eval.stmt.UseStatement;
import net.moraleboost.solrql.lang.SolrqlLexer;
import net.moraleboost.solrql.lang.SolrqlParser;
import net.moraleboost.solrql.lang.StatementListBuilder;
import net.moraleboost.solrql.lang.SyntaxException;
import net.moraleboost.solrql.lang.SolrqlParser.stmt_list_return;
import jline.ConsoleReader;

public class Console
{
    public static void main(String[] args) throws IOException
    {
        ConsoleReader conReader = new ConsoleReader();
        EvalContext ctx = new EvalContext();

        StringBuilder builder = new StringBuilder();
        CharSequenceReader reader = new CharSequenceReader(builder);
        
        final String NORMAL_PROMPT = "SQL>";
        final String CONTD_PROMPT = "... ";

        String prompt = NORMAL_PROMPT;
        
        // 最初の引数をデフォルトのSolr URLとみなす
        if (args.length >= 1) {
            UseStatement use = new UseStatement();
            use.setUrl(args[0]);
            try {
                use.execute(ctx);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        while (true) {
            String line = conReader.readLine(prompt);
            if (line == null) {
                break;
            }
            
            builder.append(line + "\n");
            reader.reset();
            try {
                if (tryEvaluate(reader, ctx)) {
                    prompt = NORMAL_PROMPT;
                } else {
                    prompt = CONTD_PROMPT;
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
                prompt = NORMAL_PROMPT;
            }
            builder.setLength(0);
            builder.trimToSize();
        }
    }
    
    private static boolean tryEvaluate(Reader reader, EvalContext ctx)
    throws SyntaxException, EvalException, IOException
    {
        ANTLRReaderStream stream = new ANTLRReaderStream(reader);
        
        RecognizerSharedState state = new RecognizerSharedState();
        SolrqlLexer lexer = new SolrqlLexer(stream, state);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SolrqlParser parser = new SolrqlParser(tokenStream);
        
        try {
            stmt_list_return ret = parser.stmt_list();
            if (ret != null) {
                evaluate((CommonTree)ret.getTree(), ctx);
            }
        } catch (MismatchedTokenException e) {
            if (e.getUnexpectedType() == SolrqlParser.EOF) {
                // immature input. continue.
                return false;
            } else {
                throw new SyntaxException(
                        lexer.getErrorMessage(e, SolrqlParser.tokenNames), e);
            }
        } catch (RecognitionException e) {
            throw new SyntaxException(
                    lexer.getErrorMessage(e, SolrqlParser.tokenNames), e);
        }
        
        return true;
    }
    
    private static void evaluate(CommonTree t, EvalContext ctx)
    throws EvalException, SyntaxException
    {
        printTree(t, 0);
        
        List<Statement> statements = new StatementListBuilder().build(t);
        
        for (Statement stmt: statements) {
            Object ret = stmt.execute(ctx);
            
            if (ret == null) {
                System.out.println("OK.");
                continue;
            }
            
            if (ret instanceof UpdateResponse) {
                printUpdateResponse((UpdateResponse)ret);
            } else if (ret instanceof SelectStatement.Result) {
                printSelectResult((SelectStatement.Result)ret);
            } else {
                System.out.println("Result: " + ret.toString());
            }
        }
    }
    
    private static void printSelectResult(SelectStatement.Result res)
    {
        int i=1;
        for (SolrDocument doc: res.getDocuments()) {
            System.out.print(Integer.toString(i) + ": ");
            int j=0;
            for (Map.Entry<String, Object> e: doc.entrySet()) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(e.getKey() + "=" + e.getValue().toString());
                ++j;
            }
            System.out.println();
            ++i;
        }
        
        System.out.println();
        System.out.println("Query=" + res.getQuery());
        System.out.println(
                "Found " + res.getResponse().getResults().getNumFound() +
                " documents, Offset=" + res.getResponse().getResults().getStart()
                );
        System.out.println(
                "Status=" + res.getResponse().getStatus() +
                ", Elapsed Time=" + res.getResponse().getElapsedTime()
                );
    }
    
    private static void printUpdateResponse(UpdateResponse res)
    {
        System.out.println(
                "Status=" + res.getStatus() +
                ", Elapsed Time=" + res.getElapsedTime()
                );
    }

    private static void printTree(Tree t, int indent)
    {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; ++i) {
                sb = sb.append("    ");
            }

            if (!t.isNil()) {
                System.out.println(sb.toString() + t.toString());
                ++indent;
            }

            for (int i = 0; i < t.getChildCount(); ++i) {
                printTree(t.getChild(i), indent);
            }
        }
    }
}
