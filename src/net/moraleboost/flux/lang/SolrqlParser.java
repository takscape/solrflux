// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g 2010-03-17 17:00:29

package net.moraleboost.flux.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SolrqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "T_DELETE", "T_INSERT", "T_INTO", "T_VALUES", "T_FIELDS", "T_SELECT", "T_FROM", "T_WHERE", "T_NWHERE", "T_FIELD_ALIAS", "T_ORDER", "T_ORDERING", "T_LIMIT", "T_OFFSET", "T_ASC", "T_DESC", "T_USE", "T_SERVER", "T_AS", "T_COMMIT", "T_ROLLBACK", "T_OPTIMIZE", "T_OPERATOR_OR", "T_OPERATOR_AND", "T_OPERATOR_NOT", "T_OPERATOR_EQUAL_TO_SINGLE", "T_OPERATOR_EQUAL_TO_DOUBLE", "T_OPERATOR_NOT_EQUAL_TO_SINGLE", "T_OPERATOR_NOT_EQUAL_TO_DOUBLE", "T_OPERATOR_LESS_THAN", "T_OPERATOR_LESS_THAN_OR_EQUAL_TO", "T_OPERATOR_GREATER_THAN", "T_OPERATOR_GREATER_THAN_OR_EQUAL_TO", "T_OPERATOR_PLUS", "T_OPERATOR_MINUS", "T_OPERATOR_ADD", "T_OPERATOR_SUBTRACT", "T_OPERATOR_MULTIPLY", "T_OPERATOR_DIVIDE", "T_OPERATOR_CALL", "T_OPERATOR_INDEX", "T_LIST", "SEMICOLON", "OPTIMIZE", "ID", "ROLLBACK", "COMMIT", "USE", "STRING", "AS", "DELETE", "FROM", "INSERT", "INTO", "LPAREN", "COMMA", "RPAREN", "VALUES", "ORDER", "BY", "LIMIT", "INTEGER", "OFFSET", "SELECT", "WHERE", "NWHERE", "OR", "AND", "NOT", "EQUAL_TO_SINGLE", "EQUAL_TO_DOUBLE", "NOT_EQUAL_TO_SINGLE", "NOT_EQUAL_TO_DOUBLE", "LESS_THAN", "LESS_THAN_OR_EQUAL_TO", "GREATER_THAN", "GREATER_THAN_OR_EQUAL_TO", "LSBRACKET", "RSBRACKET", "FLOAT", "TRUE", "FALSE", "NULL", "ASTERISK", "PLUS", "MINUS", "SLASH", "ASC", "DESC", "UNDERSCORE", "QUOTE_DOUBLE", "QUOTE_SINGLE", "BACKSLASH", "BACKTICK", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "STRING_SINGLE", "STRING_DOUBLE", "STRING_CORE_DOUBLE", "STRING_CORE_SINGLE", "STRING_CORE", "STRING_ESCAPE_CORE", "ID_PLAIN", "ID_ESCAPE", "ID_START", "ID_CORE", "ID_ESCAPE_CORE", "EXPONENT", "WS"
    };
    public static final int EXPONENT=135;
    public static final int T_FROM=10;
    public static final int STRING_CORE=128;
    public static final int T_OPERATOR_AND=27;
    public static final int T_OPERATOR_PLUS=37;
    public static final int NOT=72;
    public static final int T_OPTIMIZE=25;
    public static final int EOF=-1;
    public static final int RPAREN=60;
    public static final int T_INTO=6;
    public static final int INSERT=56;
    public static final int T_AS=22;
    public static final int T_OPERATOR_DIVIDE=42;
    public static final int SELECT=67;
    public static final int STRING_ESCAPE_CORE=129;
    public static final int INTO=57;
    public static final int ID_ESCAPE_CORE=134;
    public static final int D=101;
    public static final int E=102;
    public static final int LESS_THAN_OR_EQUAL_TO=78;
    public static final int F=103;
    public static final int G=104;
    public static final int A=98;
    public static final int B=99;
    public static final int C=100;
    public static final int T_OPERATOR_GREATER_THAN_OR_EQUAL_TO=36;
    public static final int ASC=91;
    public static final int L=109;
    public static final int M=110;
    public static final int T_ORDER=14;
    public static final int N=111;
    public static final int O=112;
    public static final int H=105;
    public static final int T_ORDERING=15;
    public static final int I=106;
    public static final int NULL=86;
    public static final int J=107;
    public static final int K=108;
    public static final int QUOTE_DOUBLE=94;
    public static final int U=118;
    public static final int T=117;
    public static final int W=120;
    public static final int T_OPERATOR_LESS_THAN=33;
    public static final int V=119;
    public static final int UNDERSCORE=93;
    public static final int Q=114;
    public static final int SEMICOLON=46;
    public static final int P=113;
    public static final int DELETE=54;
    public static final int S=116;
    public static final int R=115;
    public static final int ROLLBACK=49;
    public static final int Y=122;
    public static final int ID_ESCAPE=131;
    public static final int X=121;
    public static final int Z=123;
    public static final int BACKTICK=97;
    public static final int LSBRACKET=81;
    public static final int T_NWHERE=12;
    public static final int WS=136;
    public static final int NOT_EQUAL_TO_SINGLE=75;
    public static final int T_WHERE=11;
    public static final int OR=70;
    public static final int LESS_THAN=77;
    public static final int T_FIELD_ALIAS=13;
    public static final int QUOTE_SINGLE=95;
    public static final int USE=51;
    public static final int T_SELECT=9;
    public static final int T_OPERATOR_EQUAL_TO_DOUBLE=30;
    public static final int FROM=55;
    public static final int T_COMMIT=23;
    public static final int FALSE=85;
    public static final int GREATER_THAN_OR_EQUAL_TO=80;
    public static final int BACKSLASH=96;
    public static final int EQUAL_TO_DOUBLE=74;
    public static final int WHERE=68;
    public static final int NOT_EQUAL_TO_DOUBLE=76;
    public static final int ID_PLAIN=130;
    public static final int STRING_CORE_DOUBLE=126;
    public static final int ORDER=62;
    public static final int T_LIMIT=16;
    public static final int LIMIT=64;
    public static final int T_INSERT=5;
    public static final int T_USE=20;
    public static final int FLOAT=83;
    public static final int STRING_CORE_SINGLE=127;
    public static final int ID=48;
    public static final int AND=71;
    public static final int LPAREN=58;
    public static final int ASTERISK=87;
    public static final int T_OPERATOR_NOT_EQUAL_TO_SINGLE=31;
    public static final int T_OPERATOR_LESS_THAN_OR_EQUAL_TO=34;
    public static final int T_LIST=45;
    public static final int AS=53;
    public static final int SLASH=90;
    public static final int T_OPERATOR_SUBTRACT=40;
    public static final int COMMA=59;
    public static final int RSBRACKET=82;
    public static final int T_OPERATOR_CALL=43;
    public static final int OFFSET=66;
    public static final int T_OPERATOR_OR=26;
    public static final int PLUS=88;
    public static final int T_OPERATOR_MINUS=38;
    public static final int T_ASC=18;
    public static final int T_OPERATOR_INDEX=44;
    public static final int INTEGER=65;
    public static final int T_OPERATOR_ADD=39;
    public static final int BY=63;
    public static final int NWHERE=69;
    public static final int T_OPERATOR_EQUAL_TO_SINGLE=29;
    public static final int T_OPERATOR_NOT=28;
    public static final int GREATER_THAN=79;
    public static final int T_OPERATOR_NOT_EQUAL_TO_DOUBLE=32;
    public static final int T_VALUES=7;
    public static final int T_OFFSET=17;
    public static final int ID_CORE=133;
    public static final int VALUES=61;
    public static final int T_DESC=19;
    public static final int T_ROLLBACK=24;
    public static final int MINUS=89;
    public static final int T_FIELDS=8;
    public static final int TRUE=84;
    public static final int EQUAL_TO_SINGLE=73;
    public static final int OPTIMIZE=47;
    public static final int COMMIT=50;
    public static final int T_OPERATOR_GREATER_THAN=35;
    public static final int T_SERVER=21;
    public static final int T_DELETE=4;
    public static final int STRING_DOUBLE=125;
    public static final int STRING_SINGLE=124;
    public static final int DESC=92;
    public static final int ID_START=132;
    public static final int T_OPERATOR_MULTIPLY=41;
    public static final int STRING=52;

    // delegates
    // delegators


        public SolrqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SolrqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SolrqlParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g"; }


    public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
    throws RecognitionException
    {
        throw new MismatchedTokenException(ttype, input);
    }


    public static class stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt_list"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:76:1: stmt_list : ( stmt_core SEMICOLON )* EOF ;
    public final SolrqlParser.stmt_list_return stmt_list() throws RecognitionException {
        SolrqlParser.stmt_list_return retval = new SolrqlParser.stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        SolrqlParser.stmt_core_return stmt_core1 = null;


        Object SEMICOLON2_tree=null;
        Object EOF3_tree=null;

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:77:5: ( ( stmt_core SEMICOLON )* EOF )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:77:7: ( stmt_core SEMICOLON )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:77:7: ( stmt_core SEMICOLON )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==OPTIMIZE||(LA1_0>=ROLLBACK && LA1_0<=USE)||LA1_0==DELETE||LA1_0==INSERT||LA1_0==SELECT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:77:8: stmt_core SEMICOLON
            	    {
            	    pushFollow(FOLLOW_stmt_core_in_stmt_list376);
            	    stmt_core1=stmt_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt_core1.getTree());
            	    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stmt_list378); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_stmt_list383); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stmt_list"

    public static class stmt_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt_core"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:80:1: stmt_core : ( select_stmt | insert_stmt | delete_stmt | use_stmt | commit_stmt | rollback_stmt | optimize_stmt );
    public final SolrqlParser.stmt_core_return stmt_core() throws RecognitionException {
        SolrqlParser.stmt_core_return retval = new SolrqlParser.stmt_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SolrqlParser.select_stmt_return select_stmt4 = null;

        SolrqlParser.insert_stmt_return insert_stmt5 = null;

        SolrqlParser.delete_stmt_return delete_stmt6 = null;

        SolrqlParser.use_stmt_return use_stmt7 = null;

        SolrqlParser.commit_stmt_return commit_stmt8 = null;

        SolrqlParser.rollback_stmt_return rollback_stmt9 = null;

        SolrqlParser.optimize_stmt_return optimize_stmt10 = null;



        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:81:5: ( select_stmt | insert_stmt | delete_stmt | use_stmt | commit_stmt | rollback_stmt | optimize_stmt )
            int alt2=7;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt2=1;
                }
                break;
            case INSERT:
                {
                alt2=2;
                }
                break;
            case DELETE:
                {
                alt2=3;
                }
                break;
            case USE:
                {
                alt2=4;
                }
                break;
            case COMMIT:
                {
                alt2=5;
                }
                break;
            case ROLLBACK:
                {
                alt2=6;
                }
                break;
            case OPTIMIZE:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:81:7: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_stmt_core401);
                    select_stmt4=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:82:7: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_stmt_core409);
                    insert_stmt5=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:83:7: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_stmt_core417);
                    delete_stmt6=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:84:7: use_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_use_stmt_in_stmt_core425);
                    use_stmt7=use_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, use_stmt7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:85:7: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_stmt_core433);
                    commit_stmt8=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:86:7: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_stmt_core441);
                    rollback_stmt9=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:87:7: optimize_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_optimize_stmt_in_stmt_core449);
                    optimize_stmt10=optimize_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, optimize_stmt10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stmt_core"

    public static class optimize_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimize_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:90:1: optimize_stmt : OPTIMIZE ( ID )? -> ^( T_OPTIMIZE ( ID )? ) ;
    public final SolrqlParser.optimize_stmt_return optimize_stmt() throws RecognitionException {
        SolrqlParser.optimize_stmt_return retval = new SolrqlParser.optimize_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPTIMIZE11=null;
        Token ID12=null;

        Object OPTIMIZE11_tree=null;
        Object ID12_tree=null;
        RewriteRuleTokenStream stream_OPTIMIZE=new RewriteRuleTokenStream(adaptor,"token OPTIMIZE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:91:5: ( OPTIMIZE ( ID )? -> ^( T_OPTIMIZE ( ID )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:91:7: OPTIMIZE ( ID )?
            {
            OPTIMIZE11=(Token)match(input,OPTIMIZE,FOLLOW_OPTIMIZE_in_optimize_stmt466);  
            stream_OPTIMIZE.add(OPTIMIZE11);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:91:16: ( ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:91:16: ID
                    {
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_optimize_stmt468);  
                    stream_ID.add(ID12);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:7: -> ^( T_OPTIMIZE ( ID )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:92:10: ^( T_OPTIMIZE ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPTIMIZE, "T_OPTIMIZE"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:93:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optimize_stmt"

    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rollback_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:97:1: rollback_stmt : ROLLBACK ( ID )? -> ^( T_ROLLBACK ( ID )? ) ;
    public final SolrqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SolrqlParser.rollback_stmt_return retval = new SolrqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK13=null;
        Token ID14=null;

        Object ROLLBACK13_tree=null;
        Object ID14_tree=null;
        RewriteRuleTokenStream stream_ROLLBACK=new RewriteRuleTokenStream(adaptor,"token ROLLBACK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:98:5: ( ROLLBACK ( ID )? -> ^( T_ROLLBACK ( ID )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:98:7: ROLLBACK ( ID )?
            {
            ROLLBACK13=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt517);  
            stream_ROLLBACK.add(ROLLBACK13);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:98:16: ( ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:98:16: ID
                    {
                    ID14=(Token)match(input,ID,FOLLOW_ID_in_rollback_stmt519);  
                    stream_ID.add(ID14);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:7: -> ^( T_ROLLBACK ( ID )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:99:10: ^( T_ROLLBACK ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ROLLBACK, "T_ROLLBACK"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:100:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rollback_stmt"

    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:104:1: commit_stmt : COMMIT ( ID )? -> ^( T_COMMIT ( ID )? ) ;
    public final SolrqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SolrqlParser.commit_stmt_return retval = new SolrqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMIT15=null;
        Token ID16=null;

        Object COMMIT15_tree=null;
        Object ID16_tree=null;
        RewriteRuleTokenStream stream_COMMIT=new RewriteRuleTokenStream(adaptor,"token COMMIT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:105:5: ( COMMIT ( ID )? -> ^( T_COMMIT ( ID )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:105:7: COMMIT ( ID )?
            {
            COMMIT15=(Token)match(input,COMMIT,FOLLOW_COMMIT_in_commit_stmt568);  
            stream_COMMIT.add(COMMIT15);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:105:14: ( ID )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:105:14: ID
                    {
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_commit_stmt570);  
                    stream_ID.add(ID16);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 106:7: -> ^( T_COMMIT ( ID )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:106:10: ^( T_COMMIT ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_COMMIT, "T_COMMIT"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:107:18: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commit_stmt"

    public static class use_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:111:1: use_stmt : USE url= STRING ( AS ref= ID )? -> ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? ) ;
    public final SolrqlParser.use_stmt_return use_stmt() throws RecognitionException {
        SolrqlParser.use_stmt_return retval = new SolrqlParser.use_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token url=null;
        Token ref=null;
        Token USE17=null;
        Token AS18=null;

        Object url_tree=null;
        Object ref_tree=null;
        Object USE17_tree=null;
        Object AS18_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:112:5: ( USE url= STRING ( AS ref= ID )? -> ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:112:7: USE url= STRING ( AS ref= ID )?
            {
            USE17=(Token)match(input,USE,FOLLOW_USE_in_use_stmt619);  
            stream_USE.add(USE17);

            url=(Token)match(input,STRING,FOLLOW_STRING_in_use_stmt623);  
            stream_STRING.add(url);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:112:22: ( AS ref= ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:112:23: AS ref= ID
                    {
                    AS18=(Token)match(input,AS,FOLLOW_AS_in_use_stmt626);  
                    stream_AS.add(AS18);

                    ref=(Token)match(input,ID,FOLLOW_ID_in_use_stmt630);  
                    stream_ID.add(ref);


                    }
                    break;

            }



            // AST REWRITE
            // elements: url, ref
            // token labels: ref, url
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_ref=new RewriteRuleTokenStream(adaptor,"token ref",ref);
            RewriteRuleTokenStream stream_url=new RewriteRuleTokenStream(adaptor,"token url",url);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:7: -> ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:113:10: ^( T_USE ^( T_SERVER $url) ( ^( T_AS $ref) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_USE, "T_USE"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:114:15: ^( T_SERVER $url)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_SERVER, "T_SERVER"), root_2);

                adaptor.addChild(root_2, stream_url.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:114:32: ( ^( T_AS $ref) )?
                if ( stream_ref.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:114:32: ^( T_AS $ref)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_AS, "T_AS"), root_2);

                    adaptor.addChild(root_2, stream_ref.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ref.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "use_stmt"

    public static class delete_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:118:1: delete_stmt : DELETE ( FROM src= ID )? ( where_clause )? -> ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? ) ;
    public final SolrqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SolrqlParser.delete_stmt_return retval = new SolrqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token src=null;
        Token DELETE19=null;
        Token FROM20=null;
        SolrqlParser.where_clause_return where_clause21 = null;


        Object src_tree=null;
        Object DELETE19_tree=null;
        Object FROM20_tree=null;
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:119:5: ( DELETE ( FROM src= ID )? ( where_clause )? -> ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:119:7: DELETE ( FROM src= ID )? ( where_clause )?
            {
            DELETE19=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt692);  
            stream_DELETE.add(DELETE19);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:119:14: ( FROM src= ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FROM) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:119:15: FROM src= ID
                    {
                    FROM20=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt695);  
                    stream_FROM.add(FROM20);

                    src=(Token)match(input,ID,FOLLOW_ID_in_delete_stmt699);  
                    stream_ID.add(src);


                    }
                    break;

            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:119:29: ( where_clause )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=WHERE && LA8_0<=NWHERE)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:119:29: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_delete_stmt703);
                    where_clause21=where_clause();

                    state._fsp--;

                    stream_where_clause.add(where_clause21.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: where_clause, src
            // token labels: src
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_src=new RewriteRuleTokenStream(adaptor,"token src",src);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:7: -> ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:120:10: ^( T_DELETE ( ^( T_FROM $src) )? ( where_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_DELETE, "T_DELETE"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:121:18: ( ^( T_FROM $src) )?
                if ( stream_src.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:121:18: ^( T_FROM $src)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_FROM, "T_FROM"), root_2);

                    adaptor.addChild(root_2, stream_src.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_src.reset();
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:121:34: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete_stmt"

    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:125:1: insert_stmt : INSERT ( INTO dest= ID )? LPAREN fields+= ID ( COMMA fields+= ID )* RPAREN ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt ) -> ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? ) ;
    public final SolrqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SolrqlParser.insert_stmt_return retval = new SolrqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dest=null;
        Token INSERT22=null;
        Token INTO23=null;
        Token LPAREN24=null;
        Token COMMA25=null;
        Token RPAREN26=null;
        Token VALUES27=null;
        Token LPAREN28=null;
        Token COMMA30=null;
        Token RPAREN32=null;
        Token fields=null;
        List list_fields=null;
        SolrqlParser.expression_return expression29 = null;

        SolrqlParser.expression_return expression31 = null;

        SolrqlParser.select_stmt_return select_stmt33 = null;


        Object dest_tree=null;
        Object INSERT22_tree=null;
        Object INTO23_tree=null;
        Object LPAREN24_tree=null;
        Object COMMA25_tree=null;
        Object RPAREN26_tree=null;
        Object VALUES27_tree=null;
        Object LPAREN28_tree=null;
        Object COMMA30_tree=null;
        Object RPAREN32_tree=null;
        Object fields_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_VALUES=new RewriteRuleTokenStream(adaptor,"token VALUES");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:126:5: ( INSERT ( INTO dest= ID )? LPAREN fields+= ID ( COMMA fields+= ID )* RPAREN ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt ) -> ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:126:7: INSERT ( INTO dest= ID )? LPAREN fields+= ID ( COMMA fields+= ID )* RPAREN ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt )
            {
            INSERT22=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt760);  
            stream_INSERT.add(INSERT22);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:126:14: ( INTO dest= ID )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INTO) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:126:15: INTO dest= ID
                    {
                    INTO23=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt763);  
                    stream_INTO.add(INTO23);

                    dest=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt767);  
                    stream_ID.add(dest);


                    }
                    break;

            }

            LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt771);  
            stream_LPAREN.add(LPAREN24);

            fields=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt775);  
            stream_ID.add(fields);

            if (list_fields==null) list_fields=new ArrayList();
            list_fields.add(fields);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:126:48: ( COMMA fields+= ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:126:49: COMMA fields+= ID
            	    {
            	    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt778);  
            	    stream_COMMA.add(COMMA25);

            	    fields=(Token)match(input,ID,FOLLOW_ID_in_insert_stmt782);  
            	    stream_ID.add(fields);

            	    if (list_fields==null) list_fields=new ArrayList();
            	    list_fields.add(fields);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt786);  
            stream_RPAREN.add(RPAREN26);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:127:7: ( VALUES LPAREN expression ( COMMA expression )* RPAREN | select_stmt )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==VALUES) ) {
                alt12=1;
            }
            else if ( (LA12_0==SELECT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:127:9: VALUES LPAREN expression ( COMMA expression )* RPAREN
                    {
                    VALUES27=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt796);  
                    stream_VALUES.add(VALUES27);

                    LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt798);  
                    stream_LPAREN.add(LPAREN28);

                    pushFollow(FOLLOW_expression_in_insert_stmt800);
                    expression29=expression();

                    state._fsp--;

                    stream_expression.add(expression29.getTree());
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:127:34: ( COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:127:35: COMMA expression
                    	    {
                    	    COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt803);  
                    	    stream_COMMA.add(COMMA30);

                    	    pushFollow(FOLLOW_expression_in_insert_stmt805);
                    	    expression31=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    RPAREN32=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt809);  
                    stream_RPAREN.add(RPAREN32);


                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:128:9: select_stmt
                    {
                    pushFollow(FOLLOW_select_stmt_in_insert_stmt819);
                    select_stmt33=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt33.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: select_stmt, fields, dest, expression
            // token labels: dest
            // rule labels: retval
            // token list labels: fields
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_dest=new RewriteRuleTokenStream(adaptor,"token dest",dest);
            RewriteRuleTokenStream stream_fields=new RewriteRuleTokenStream(adaptor,"token fields", list_fields);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:7: -> ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:130:10: ^( T_INSERT ( ^( T_INTO $dest) )? ^( T_FIELDS ( $fields)+ ) ( ^( T_VALUES ( expression )+ ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_INSERT, "T_INSERT"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:131:18: ( ^( T_INTO $dest) )?
                if ( stream_dest.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:131:18: ^( T_INTO $dest)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_INTO, "T_INTO"), root_2);

                    adaptor.addChild(root_2, stream_dest.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_dest.reset();
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:131:35: ^( T_FIELDS ( $fields)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_FIELDS, "T_FIELDS"), root_2);

                if ( !(stream_fields.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fields.hasNext() ) {
                    adaptor.addChild(root_2, stream_fields.nextNode());

                }
                stream_fields.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:131:56: ( ^( T_VALUES ( expression )+ ) )?
                if ( stream_expression.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:131:56: ^( T_VALUES ( expression )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_VALUES, "T_VALUES"), root_2);

                    if ( !(stream_expression.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_2, stream_expression.nextTree());

                    }
                    stream_expression.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expression.reset();
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:131:81: ( select_stmt )?
                if ( stream_select_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_select_stmt.nextTree());

                }
                stream_select_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"

    public static class select_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_stmt"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:135:1: select_stmt : select_core ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )? -> ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? ) ;
    public final SolrqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SolrqlParser.select_stmt_return retval = new SolrqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER35=null;
        Token BY36=null;
        Token COMMA38=null;
        Token LIMIT40=null;
        Token OFFSET41=null;
        SolrqlParser.select_core_return select_core34 = null;

        SolrqlParser.ordering_term_return ordering_term37 = null;

        SolrqlParser.ordering_term_return ordering_term39 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER35_tree=null;
        Object BY36_tree=null;
        Object COMMA38_tree=null;
        Object LIMIT40_tree=null;
        Object OFFSET41_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        RewriteRuleSubtreeStream stream_select_core=new RewriteRuleSubtreeStream(adaptor,"rule select_core");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:136:5: ( select_core ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )? -> ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:136:7: select_core ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_core_in_select_stmt899);
            select_core34=select_core();

            state._fsp--;

            stream_select_core.add(select_core34.getTree());
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:136:19: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ORDER) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:136:20: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER35=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt902);  
                    stream_ORDER.add(ORDER35);

                    BY36=(Token)match(input,BY,FOLLOW_BY_in_select_stmt904);  
                    stream_BY.add(BY36);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt906);
                    ordering_term37=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term37.getTree());
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:136:43: ( COMMA ordering_term )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:136:44: COMMA ordering_term
                    	    {
                    	    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt909);  
                    	    stream_COMMA.add(COMMA38);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt911);
                    	    ordering_term39=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term39.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:137:7: ( LIMIT limit= INTEGER ( OFFSET offset= INTEGER )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LIMIT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:137:8: LIMIT limit= INTEGER ( OFFSET offset= INTEGER )?
                    {
                    LIMIT40=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt924);  
                    stream_LIMIT.add(LIMIT40);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt928);  
                    stream_INTEGER.add(limit);

                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:137:28: ( OFFSET offset= INTEGER )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==OFFSET) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:137:29: OFFSET offset= INTEGER
                            {
                            OFFSET41=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt931);  
                            stream_OFFSET.add(OFFSET41);

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt935);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, ordering_term, select_core, offset
            // token labels: limit, offset
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleTokenStream stream_offset=new RewriteRuleTokenStream(adaptor,"token offset",offset);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:7: -> ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:138:10: ^( select_core ( ^( T_ORDER ( ordering_term )+ ) )? ( ^( T_LIMIT $limit) )? ( ^( T_OFFSET $offset) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_select_core.nextNode(), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:139:21: ( ^( T_ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:139:21: ^( T_ORDER ( ordering_term )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ORDER, "T_ORDER"), root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:139:48: ( ^( T_LIMIT $limit) )?
                if ( stream_limit.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:139:48: ^( T_LIMIT $limit)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_LIMIT, "T_LIMIT"), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:139:67: ( ^( T_OFFSET $offset) )?
                if ( stream_offset.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:139:67: ^( T_OFFSET $offset)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OFFSET, "T_OFFSET"), root_2);

                    adaptor.addChild(root_2, stream_offset.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_offset.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_stmt"

    public static class select_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "select_core"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:143:1: select_core : SELECT result_field ( COMMA result_field )* ( FROM src= ID )? ( where_clause )? -> ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? ) ;
    public final SolrqlParser.select_core_return select_core() throws RecognitionException {
        SolrqlParser.select_core_return retval = new SolrqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token src=null;
        Token SELECT42=null;
        Token COMMA44=null;
        Token FROM46=null;
        SolrqlParser.result_field_return result_field43 = null;

        SolrqlParser.result_field_return result_field45 = null;

        SolrqlParser.where_clause_return where_clause47 = null;


        Object src_tree=null;
        Object SELECT42_tree=null;
        Object COMMA44_tree=null;
        Object FROM46_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_result_field=new RewriteRuleSubtreeStream(adaptor,"rule result_field");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:5: ( SELECT result_field ( COMMA result_field )* ( FROM src= ID )? ( where_clause )? -> ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:7: SELECT result_field ( COMMA result_field )* ( FROM src= ID )? ( where_clause )?
            {
            SELECT42=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1008);  
            stream_SELECT.add(SELECT42);

            pushFollow(FOLLOW_result_field_in_select_core1010);
            result_field43=result_field();

            state._fsp--;

            stream_result_field.add(result_field43.getTree());
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:27: ( COMMA result_field )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:28: COMMA result_field
            	    {
            	    COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1013);  
            	    stream_COMMA.add(COMMA44);

            	    pushFollow(FOLLOW_result_field_in_select_core1015);
            	    result_field45=result_field();

            	    state._fsp--;

            	    stream_result_field.add(result_field45.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:49: ( FROM src= ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==FROM) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:50: FROM src= ID
                    {
                    FROM46=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1020);  
                    stream_FROM.add(FROM46);

                    src=(Token)match(input,ID,FOLLOW_ID_in_select_core1024);  
                    stream_ID.add(src);


                    }
                    break;

            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:64: ( where_clause )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=WHERE && LA19_0<=NWHERE)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:144:64: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_core1028);
                    where_clause47=where_clause();

                    state._fsp--;

                    stream_where_clause.add(where_clause47.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: where_clause, result_field, src
            // token labels: src
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_src=new RewriteRuleTokenStream(adaptor,"token src",src);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:7: -> ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:145:10: ^( T_SELECT ^( T_FIELDS ( result_field )+ ) ( ^( T_FROM $src) )? ( where_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_SELECT, "T_SELECT"), root_1);

                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:146:18: ^( T_FIELDS ( result_field )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_FIELDS, "T_FIELDS"), root_2);

                if ( !(stream_result_field.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_result_field.hasNext() ) {
                    adaptor.addChild(root_2, stream_result_field.nextTree());

                }
                stream_result_field.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:146:44: ( ^( T_FROM $src) )?
                if ( stream_src.hasNext() ) {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:146:44: ^( T_FROM $src)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_FROM, "T_FROM"), root_2);

                    adaptor.addChild(root_2, stream_src.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_src.reset();
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:146:60: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "select_core"

    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_clause"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:150:1: where_clause : ( WHERE where_expr= where_expression -> ^( T_WHERE where_expression ) | NWHERE STRING -> ^( T_NWHERE STRING ) );
    public final SolrqlParser.where_clause_return where_clause() throws RecognitionException {
        SolrqlParser.where_clause_return retval = new SolrqlParser.where_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE48=null;
        Token NWHERE49=null;
        Token STRING50=null;
        SolrqlParser.where_expression_return where_expr = null;


        Object WHERE48_tree=null;
        Object NWHERE49_tree=null;
        Object STRING50_tree=null;
        RewriteRuleTokenStream stream_NWHERE=new RewriteRuleTokenStream(adaptor,"token NWHERE");
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_where_expression=new RewriteRuleSubtreeStream(adaptor,"rule where_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:151:5: ( WHERE where_expr= where_expression -> ^( T_WHERE where_expression ) | NWHERE STRING -> ^( T_NWHERE STRING ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WHERE) ) {
                alt20=1;
            }
            else if ( (LA20_0==NWHERE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:151:7: WHERE where_expr= where_expression
                    {
                    WHERE48=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause1092);  
                    stream_WHERE.add(WHERE48);

                    pushFollow(FOLLOW_where_expression_in_where_clause1096);
                    where_expr=where_expression();

                    state._fsp--;

                    stream_where_expression.add(where_expr.getTree());


                    // AST REWRITE
                    // elements: where_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:7: -> ^( T_WHERE where_expression )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:152:10: ^( T_WHERE where_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_WHERE, "T_WHERE"), root_1);

                        adaptor.addChild(root_1, stream_where_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:153:7: NWHERE STRING
                    {
                    NWHERE49=(Token)match(input,NWHERE,FOLLOW_NWHERE_in_where_clause1118);  
                    stream_NWHERE.add(NWHERE49);

                    STRING50=(Token)match(input,STRING,FOLLOW_STRING_in_where_clause1120);  
                    stream_STRING.add(STRING50);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:7: -> ^( T_NWHERE STRING )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:154:10: ^( T_NWHERE STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_NWHERE, "T_NWHERE"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_clause"

    public static class result_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "result_field"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:157:1: result_field : expression ( ( AS )? field_alias= ID )? -> ^( T_FIELD_ALIAS expression ( $field_alias)? ) ;
    public final SolrqlParser.result_field_return result_field() throws RecognitionException {
        SolrqlParser.result_field_return retval = new SolrqlParser.result_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token field_alias=null;
        Token AS52=null;
        SolrqlParser.expression_return expression51 = null;


        Object field_alias_tree=null;
        Object AS52_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:158:5: ( expression ( ( AS )? field_alias= ID )? -> ^( T_FIELD_ALIAS expression ( $field_alias)? ) )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:158:7: expression ( ( AS )? field_alias= ID )?
            {
            pushFollow(FOLLOW_expression_in_result_field1151);
            expression51=expression();

            state._fsp--;

            stream_expression.add(expression51.getTree());
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:158:18: ( ( AS )? field_alias= ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:158:19: ( AS )? field_alias= ID
                    {
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:158:19: ( AS )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==AS) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:158:19: AS
                            {
                            AS52=(Token)match(input,AS,FOLLOW_AS_in_result_field1154);  
                            stream_AS.add(AS52);


                            }
                            break;

                    }

                    field_alias=(Token)match(input,ID,FOLLOW_ID_in_result_field1159);  
                    stream_ID.add(field_alias);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, field_alias
            // token labels: field_alias
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_field_alias=new RewriteRuleTokenStream(adaptor,"token field_alias",field_alias);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:7: -> ^( T_FIELD_ALIAS expression ( $field_alias)? )
            {
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:159:10: ^( T_FIELD_ALIAS expression ( $field_alias)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_FIELD_ALIAS, "T_FIELD_ALIAS"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:159:37: ( $field_alias)?
                if ( stream_field_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_alias.nextNode());

                }
                stream_field_alias.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "result_field"

    public static class where_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:162:1: where_expression : (expr1= where_and_expression -> $expr1) ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )* ;
    public final SolrqlParser.where_expression_return where_expression() throws RecognitionException {
        SolrqlParser.where_expression_return retval = new SolrqlParser.where_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR53=null;
        SolrqlParser.where_and_expression_return expr1 = null;

        SolrqlParser.where_and_expression_return expr2 = null;


        Object OR53_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_where_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule where_and_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:163:5: ( (expr1= where_and_expression -> $expr1) ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:163:7: (expr1= where_and_expression -> $expr1) ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:163:7: (expr1= where_and_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:163:8: expr1= where_and_expression
            {
            pushFollow(FOLLOW_where_and_expression_in_where_expression1199);
            expr1=where_and_expression();

            state._fsp--;

            stream_where_and_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:35: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:164:7: ( OR expr2= where_and_expression -> ^( T_OPERATOR_OR $where_expression $expr2) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:164:8: OR expr2= where_and_expression
            	    {
            	    OR53=(Token)match(input,OR,FOLLOW_OR_in_where_expression1214);  
            	    stream_OR.add(OR53);

            	    pushFollow(FOLLOW_where_and_expression_in_where_expression1218);
            	    expr2=where_and_expression();

            	    state._fsp--;

            	    stream_where_and_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: expr2, where_expression
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 164:38: -> ^( T_OPERATOR_OR $where_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:164:41: ^( T_OPERATOR_OR $where_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_OR, "T_OPERATOR_OR"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_expression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:167:1: expression : (expr1= and_expression -> $expr1) ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )* ;
    public final SolrqlParser.expression_return expression() throws RecognitionException {
        SolrqlParser.expression_return retval = new SolrqlParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR54=null;
        SolrqlParser.and_expression_return expr1 = null;

        SolrqlParser.and_expression_return expr2 = null;


        Object OR54_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:168:5: ( (expr1= and_expression -> $expr1) ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:168:7: (expr1= and_expression -> $expr1) ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:168:7: (expr1= and_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:168:8: expr1= and_expression
            {
            pushFollow(FOLLOW_and_expression_in_expression1252);
            expr1=and_expression();

            state._fsp--;

            stream_and_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 168:29: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:169:7: ( OR expr2= and_expression -> ^( T_OPERATOR_OR $expression $expr2) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:169:8: OR expr2= and_expression
            	    {
            	    OR54=(Token)match(input,OR,FOLLOW_OR_in_expression1267);  
            	    stream_OR.add(OR54);

            	    pushFollow(FOLLOW_and_expression_in_expression1271);
            	    expr2=and_expression();

            	    state._fsp--;

            	    stream_and_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: expr2, expression
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 169:32: -> ^( T_OPERATOR_OR $expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:169:35: ^( T_OPERATOR_OR $expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_OR, "T_OPERATOR_OR"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class where_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_and_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:172:1: where_and_expression : (expr1= where_not_expression -> $expr1) ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )* ;
    public final SolrqlParser.where_and_expression_return where_and_expression() throws RecognitionException {
        SolrqlParser.where_and_expression_return retval = new SolrqlParser.where_and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND55=null;
        SolrqlParser.where_not_expression_return expr1 = null;

        SolrqlParser.where_not_expression_return expr2 = null;


        Object AND55_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_where_not_expression=new RewriteRuleSubtreeStream(adaptor,"rule where_not_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:173:5: ( (expr1= where_not_expression -> $expr1) ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:173:7: (expr1= where_not_expression -> $expr1) ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:173:7: (expr1= where_not_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:173:8: expr1= where_not_expression
            {
            pushFollow(FOLLOW_where_not_expression_in_where_and_expression1305);
            expr1=where_not_expression();

            state._fsp--;

            stream_where_not_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:35: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:174:7: ( AND expr2= where_not_expression -> ^( T_OPERATOR_AND $where_and_expression $expr2) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:174:8: AND expr2= where_not_expression
            	    {
            	    AND55=(Token)match(input,AND,FOLLOW_AND_in_where_and_expression1320);  
            	    stream_AND.add(AND55);

            	    pushFollow(FOLLOW_where_not_expression_in_where_and_expression1324);
            	    expr2=where_not_expression();

            	    state._fsp--;

            	    stream_where_not_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: where_and_expression, expr2
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 174:39: -> ^( T_OPERATOR_AND $where_and_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:174:42: ^( T_OPERATOR_AND $where_and_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_AND, "T_OPERATOR_AND"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_and_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:177:1: and_expression : (expr1= not_expression -> $expr1) ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )* ;
    public final SolrqlParser.and_expression_return and_expression() throws RecognitionException {
        SolrqlParser.and_expression_return retval = new SolrqlParser.and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND56=null;
        SolrqlParser.not_expression_return expr1 = null;

        SolrqlParser.not_expression_return expr2 = null;


        Object AND56_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_not_expression=new RewriteRuleSubtreeStream(adaptor,"rule not_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:178:5: ( (expr1= not_expression -> $expr1) ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:178:7: (expr1= not_expression -> $expr1) ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:178:7: (expr1= not_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:178:8: expr1= not_expression
            {
            pushFollow(FOLLOW_not_expression_in_and_expression1358);
            expr1=not_expression();

            state._fsp--;

            stream_not_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 178:29: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:179:7: ( AND expr2= not_expression -> ^( T_OPERATOR_AND $and_expression $expr2) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:179:8: AND expr2= not_expression
            	    {
            	    AND56=(Token)match(input,AND,FOLLOW_AND_in_and_expression1373);  
            	    stream_AND.add(AND56);

            	    pushFollow(FOLLOW_not_expression_in_and_expression1377);
            	    expr2=not_expression();

            	    state._fsp--;

            	    stream_not_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: and_expression, expr2
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 179:33: -> ^( T_OPERATOR_AND $and_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:179:36: ^( T_OPERATOR_AND $and_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_AND, "T_OPERATOR_AND"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_expression"

    public static class where_not_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_not_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:182:1: where_not_expression : (expr1= where_cmp_expression -> $expr1) ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )* ;
    public final SolrqlParser.where_not_expression_return where_not_expression() throws RecognitionException {
        SolrqlParser.where_not_expression_return retval = new SolrqlParser.where_not_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT57=null;
        SolrqlParser.where_cmp_expression_return expr1 = null;

        SolrqlParser.where_cmp_expression_return expr2 = null;


        Object NOT57_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_where_cmp_expression=new RewriteRuleSubtreeStream(adaptor,"rule where_cmp_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:183:5: ( (expr1= where_cmp_expression -> $expr1) ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:183:7: (expr1= where_cmp_expression -> $expr1) ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:183:7: (expr1= where_cmp_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:183:8: expr1= where_cmp_expression
            {
            pushFollow(FOLLOW_where_cmp_expression_in_where_not_expression1411);
            expr1=where_cmp_expression();

            state._fsp--;

            stream_where_cmp_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:35: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:184:7: ( NOT expr2= where_cmp_expression -> ^( T_OPERATOR_NOT $where_not_expression $expr2) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==NOT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:184:8: NOT expr2= where_cmp_expression
            	    {
            	    NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_where_not_expression1426);  
            	    stream_NOT.add(NOT57);

            	    pushFollow(FOLLOW_where_cmp_expression_in_where_not_expression1430);
            	    expr2=where_cmp_expression();

            	    state._fsp--;

            	    stream_where_cmp_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: where_not_expression, expr2
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 184:39: -> ^( T_OPERATOR_NOT $where_not_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:184:42: ^( T_OPERATOR_NOT $where_not_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_NOT, "T_OPERATOR_NOT"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_not_expression"

    public static class not_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:187:1: not_expression : (expr1= cmp_expression -> $expr1) ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )* ;
    public final SolrqlParser.not_expression_return not_expression() throws RecognitionException {
        SolrqlParser.not_expression_return retval = new SolrqlParser.not_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT58=null;
        SolrqlParser.cmp_expression_return expr1 = null;

        SolrqlParser.cmp_expression_return expr2 = null;


        Object NOT58_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_cmp_expression=new RewriteRuleSubtreeStream(adaptor,"rule cmp_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:188:5: ( (expr1= cmp_expression -> $expr1) ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:188:7: (expr1= cmp_expression -> $expr1) ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:188:7: (expr1= cmp_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:188:8: expr1= cmp_expression
            {
            pushFollow(FOLLOW_cmp_expression_in_not_expression1464);
            expr1=cmp_expression();

            state._fsp--;

            stream_cmp_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:29: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:189:7: ( NOT expr2= cmp_expression -> ^( T_OPERATOR_NOT $not_expression $expr2) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==NOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:189:8: NOT expr2= cmp_expression
            	    {
            	    NOT58=(Token)match(input,NOT,FOLLOW_NOT_in_not_expression1479);  
            	    stream_NOT.add(NOT58);

            	    pushFollow(FOLLOW_cmp_expression_in_not_expression1483);
            	    expr2=cmp_expression();

            	    state._fsp--;

            	    stream_cmp_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: expr2, not_expression
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 189:33: -> ^( T_OPERATOR_NOT $not_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:189:36: ^( T_OPERATOR_NOT $not_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_NOT, "T_OPERATOR_NOT"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "not_expression"

    public static class where_cmp_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_cmp_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:192:1: where_cmp_expression : (expr1= where_unary_expression where_cmp_operator expr2= where_unary_expression -> ^( where_cmp_operator $expr1 $expr2) | LPAREN where_expression RPAREN );
    public final SolrqlParser.where_cmp_expression_return where_cmp_expression() throws RecognitionException {
        SolrqlParser.where_cmp_expression_return retval = new SolrqlParser.where_cmp_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN60=null;
        Token RPAREN62=null;
        SolrqlParser.where_unary_expression_return expr1 = null;

        SolrqlParser.where_unary_expression_return expr2 = null;

        SolrqlParser.where_cmp_operator_return where_cmp_operator59 = null;

        SolrqlParser.where_expression_return where_expression61 = null;


        Object LPAREN60_tree=null;
        Object RPAREN62_tree=null;
        RewriteRuleSubtreeStream stream_where_cmp_operator=new RewriteRuleSubtreeStream(adaptor,"rule where_cmp_operator");
        RewriteRuleSubtreeStream stream_where_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule where_unary_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:193:5: (expr1= where_unary_expression where_cmp_operator expr2= where_unary_expression -> ^( where_cmp_operator $expr1 $expr2) | LPAREN where_expression RPAREN )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID||LA29_0==STRING||LA29_0==INTEGER||(LA29_0>=FLOAT && LA29_0<=MINUS)) ) {
                alt29=1;
            }
            else if ( (LA29_0==LPAREN) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:193:7: expr1= where_unary_expression where_cmp_operator expr2= where_unary_expression
                    {
                    pushFollow(FOLLOW_where_unary_expression_in_where_cmp_expression1516);
                    expr1=where_unary_expression();

                    state._fsp--;

                    stream_where_unary_expression.add(expr1.getTree());
                    pushFollow(FOLLOW_where_cmp_operator_in_where_cmp_expression1518);
                    where_cmp_operator59=where_cmp_operator();

                    state._fsp--;

                    stream_where_cmp_operator.add(where_cmp_operator59.getTree());
                    pushFollow(FOLLOW_where_unary_expression_in_where_cmp_expression1522);
                    expr2=where_unary_expression();

                    state._fsp--;

                    stream_where_unary_expression.add(expr2.getTree());


                    // AST REWRITE
                    // elements: where_cmp_operator, expr2, expr1
                    // token labels: 
                    // rule labels: retval, expr1, expr2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);
                    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:7: -> ^( where_cmp_operator $expr1 $expr2)
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:194:10: ^( where_cmp_operator $expr1 $expr2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_where_cmp_operator.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr1.nextTree());
                        adaptor.addChild(root_1, stream_expr2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:195:7: LPAREN where_expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_where_cmp_expression1548); 
                    pushFollow(FOLLOW_where_expression_in_where_cmp_expression1551);
                    where_expression61=where_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, where_expression61.getTree());
                    RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_where_cmp_expression1553); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_cmp_expression"

    public static class cmp_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmp_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:198:1: cmp_expression : (expr1= add_expression -> $expr1) ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )* ;
    public final SolrqlParser.cmp_expression_return cmp_expression() throws RecognitionException {
        SolrqlParser.cmp_expression_return retval = new SolrqlParser.cmp_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SolrqlParser.add_expression_return expr1 = null;

        SolrqlParser.add_expression_return expr2 = null;

        SolrqlParser.cmp_operator_return cmp_operator63 = null;


        RewriteRuleSubtreeStream stream_add_expression=new RewriteRuleSubtreeStream(adaptor,"rule add_expression");
        RewriteRuleSubtreeStream stream_cmp_operator=new RewriteRuleSubtreeStream(adaptor,"rule cmp_operator");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:199:5: ( (expr1= add_expression -> $expr1) ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:199:7: (expr1= add_expression -> $expr1) ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:199:7: (expr1= add_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:199:8: expr1= add_expression
            {
            pushFollow(FOLLOW_add_expression_in_cmp_expression1574);
            expr1=add_expression();

            state._fsp--;

            stream_add_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 199:29: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:200:7: ( cmp_operator expr2= add_expression -> ^( cmp_operator $cmp_expression $expr2) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EQUAL_TO_SINGLE||LA30_0==NOT_EQUAL_TO_SINGLE||(LA30_0>=LESS_THAN && LA30_0<=GREATER_THAN_OR_EQUAL_TO)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:200:8: cmp_operator expr2= add_expression
            	    {
            	    pushFollow(FOLLOW_cmp_operator_in_cmp_expression1589);
            	    cmp_operator63=cmp_operator();

            	    state._fsp--;

            	    stream_cmp_operator.add(cmp_operator63.getTree());
            	    pushFollow(FOLLOW_add_expression_in_cmp_expression1593);
            	    expr2=add_expression();

            	    state._fsp--;

            	    stream_add_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: cmp_expression, expr2, cmp_operator
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 200:42: -> ^( cmp_operator $cmp_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:200:45: ^( cmp_operator $cmp_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_cmp_operator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cmp_expression"

    public static class where_cmp_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_cmp_operator"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:203:1: where_cmp_operator : ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | EQUAL_TO_DOUBLE -> T_OPERATOR_EQUAL_TO_DOUBLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | NOT_EQUAL_TO_DOUBLE -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO );
    public final SolrqlParser.where_cmp_operator_return where_cmp_operator() throws RecognitionException {
        SolrqlParser.where_cmp_operator_return retval = new SolrqlParser.where_cmp_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL_TO_SINGLE64=null;
        Token EQUAL_TO_DOUBLE65=null;
        Token NOT_EQUAL_TO_SINGLE66=null;
        Token NOT_EQUAL_TO_DOUBLE67=null;
        Token LESS_THAN68=null;
        Token LESS_THAN_OR_EQUAL_TO69=null;
        Token GREATER_THAN70=null;
        Token GREATER_THAN_OR_EQUAL_TO71=null;

        Object EQUAL_TO_SINGLE64_tree=null;
        Object EQUAL_TO_DOUBLE65_tree=null;
        Object NOT_EQUAL_TO_SINGLE66_tree=null;
        Object NOT_EQUAL_TO_DOUBLE67_tree=null;
        Object LESS_THAN68_tree=null;
        Object LESS_THAN_OR_EQUAL_TO69_tree=null;
        Object GREATER_THAN70_tree=null;
        Object GREATER_THAN_OR_EQUAL_TO71_tree=null;
        RewriteRuleTokenStream stream_EQUAL_TO_SINGLE=new RewriteRuleTokenStream(adaptor,"token EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_LESS_THAN_OR_EQUAL_TO=new RewriteRuleTokenStream(adaptor,"token LESS_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_NOT_EQUAL_TO_DOUBLE=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL_TO_DOUBLE");
        RewriteRuleTokenStream stream_GREATER_THAN=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN");
        RewriteRuleTokenStream stream_NOT_EQUAL_TO_SINGLE=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_GREATER_THAN_OR_EQUAL_TO=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_LESS_THAN=new RewriteRuleTokenStream(adaptor,"token LESS_THAN");
        RewriteRuleTokenStream stream_EQUAL_TO_DOUBLE=new RewriteRuleTokenStream(adaptor,"token EQUAL_TO_DOUBLE");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:204:5: ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | EQUAL_TO_DOUBLE -> T_OPERATOR_EQUAL_TO_DOUBLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | NOT_EQUAL_TO_DOUBLE -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO )
            int alt31=8;
            switch ( input.LA(1) ) {
            case EQUAL_TO_SINGLE:
                {
                alt31=1;
                }
                break;
            case EQUAL_TO_DOUBLE:
                {
                alt31=2;
                }
                break;
            case NOT_EQUAL_TO_SINGLE:
                {
                alt31=3;
                }
                break;
            case NOT_EQUAL_TO_DOUBLE:
                {
                alt31=4;
                }
                break;
            case LESS_THAN:
                {
                alt31=5;
                }
                break;
            case LESS_THAN_OR_EQUAL_TO:
                {
                alt31=6;
                }
                break;
            case GREATER_THAN:
                {
                alt31=7;
                }
                break;
            case GREATER_THAN_OR_EQUAL_TO:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:204:7: EQUAL_TO_SINGLE
                    {
                    EQUAL_TO_SINGLE64=(Token)match(input,EQUAL_TO_SINGLE,FOLLOW_EQUAL_TO_SINGLE_in_where_cmp_operator1624);  
                    stream_EQUAL_TO_SINGLE.add(EQUAL_TO_SINGLE64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:23: -> T_OPERATOR_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_EQUAL_TO_SINGLE, "T_OPERATOR_EQUAL_TO_SINGLE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:205:7: EQUAL_TO_DOUBLE
                    {
                    EQUAL_TO_DOUBLE65=(Token)match(input,EQUAL_TO_DOUBLE,FOLLOW_EQUAL_TO_DOUBLE_in_where_cmp_operator1636);  
                    stream_EQUAL_TO_DOUBLE.add(EQUAL_TO_DOUBLE65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:23: -> T_OPERATOR_EQUAL_TO_DOUBLE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_EQUAL_TO_DOUBLE, "T_OPERATOR_EQUAL_TO_DOUBLE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:206:7: NOT_EQUAL_TO_SINGLE
                    {
                    NOT_EQUAL_TO_SINGLE66=(Token)match(input,NOT_EQUAL_TO_SINGLE,FOLLOW_NOT_EQUAL_TO_SINGLE_in_where_cmp_operator1648);  
                    stream_NOT_EQUAL_TO_SINGLE.add(NOT_EQUAL_TO_SINGLE66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:27: -> T_OPERATOR_NOT_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_NOT_EQUAL_TO_SINGLE, "T_OPERATOR_NOT_EQUAL_TO_SINGLE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:207:7: NOT_EQUAL_TO_DOUBLE
                    {
                    NOT_EQUAL_TO_DOUBLE67=(Token)match(input,NOT_EQUAL_TO_DOUBLE,FOLLOW_NOT_EQUAL_TO_DOUBLE_in_where_cmp_operator1660);  
                    stream_NOT_EQUAL_TO_DOUBLE.add(NOT_EQUAL_TO_DOUBLE67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:27: -> T_OPERATOR_NOT_EQUAL_TO_DOUBLE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_NOT_EQUAL_TO_DOUBLE, "T_OPERATOR_NOT_EQUAL_TO_DOUBLE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:208:7: LESS_THAN
                    {
                    LESS_THAN68=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_where_cmp_operator1672);  
                    stream_LESS_THAN.add(LESS_THAN68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:17: -> T_OPERATOR_LESS_THAN
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_LESS_THAN, "T_OPERATOR_LESS_THAN"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:209:7: LESS_THAN_OR_EQUAL_TO
                    {
                    LESS_THAN_OR_EQUAL_TO69=(Token)match(input,LESS_THAN_OR_EQUAL_TO,FOLLOW_LESS_THAN_OR_EQUAL_TO_in_where_cmp_operator1684);  
                    stream_LESS_THAN_OR_EQUAL_TO.add(LESS_THAN_OR_EQUAL_TO69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:29: -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_LESS_THAN_OR_EQUAL_TO, "T_OPERATOR_LESS_THAN_OR_EQUAL_TO"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:210:7: GREATER_THAN
                    {
                    GREATER_THAN70=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_where_cmp_operator1696);  
                    stream_GREATER_THAN.add(GREATER_THAN70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:20: -> T_OPERATOR_GREATER_THAN
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_GREATER_THAN, "T_OPERATOR_GREATER_THAN"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:211:7: GREATER_THAN_OR_EQUAL_TO
                    {
                    GREATER_THAN_OR_EQUAL_TO71=(Token)match(input,GREATER_THAN_OR_EQUAL_TO,FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_where_cmp_operator1708);  
                    stream_GREATER_THAN_OR_EQUAL_TO.add(GREATER_THAN_OR_EQUAL_TO71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:32: -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_GREATER_THAN_OR_EQUAL_TO, "T_OPERATOR_GREATER_THAN_OR_EQUAL_TO"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_cmp_operator"

    public static class cmp_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmp_operator"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:214:1: cmp_operator : ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO );
    public final SolrqlParser.cmp_operator_return cmp_operator() throws RecognitionException {
        SolrqlParser.cmp_operator_return retval = new SolrqlParser.cmp_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL_TO_SINGLE72=null;
        Token NOT_EQUAL_TO_SINGLE73=null;
        Token LESS_THAN74=null;
        Token LESS_THAN_OR_EQUAL_TO75=null;
        Token GREATER_THAN76=null;
        Token GREATER_THAN_OR_EQUAL_TO77=null;

        Object EQUAL_TO_SINGLE72_tree=null;
        Object NOT_EQUAL_TO_SINGLE73_tree=null;
        Object LESS_THAN74_tree=null;
        Object LESS_THAN_OR_EQUAL_TO75_tree=null;
        Object GREATER_THAN76_tree=null;
        Object GREATER_THAN_OR_EQUAL_TO77_tree=null;
        RewriteRuleTokenStream stream_EQUAL_TO_SINGLE=new RewriteRuleTokenStream(adaptor,"token EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_LESS_THAN_OR_EQUAL_TO=new RewriteRuleTokenStream(adaptor,"token LESS_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_GREATER_THAN=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN");
        RewriteRuleTokenStream stream_NOT_EQUAL_TO_SINGLE=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL_TO_SINGLE");
        RewriteRuleTokenStream stream_GREATER_THAN_OR_EQUAL_TO=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OR_EQUAL_TO");
        RewriteRuleTokenStream stream_LESS_THAN=new RewriteRuleTokenStream(adaptor,"token LESS_THAN");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:215:5: ( EQUAL_TO_SINGLE -> T_OPERATOR_EQUAL_TO_SINGLE | NOT_EQUAL_TO_SINGLE -> T_OPERATOR_NOT_EQUAL_TO_SINGLE | LESS_THAN -> T_OPERATOR_LESS_THAN | LESS_THAN_OR_EQUAL_TO -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO | GREATER_THAN -> T_OPERATOR_GREATER_THAN | GREATER_THAN_OR_EQUAL_TO -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO )
            int alt32=6;
            switch ( input.LA(1) ) {
            case EQUAL_TO_SINGLE:
                {
                alt32=1;
                }
                break;
            case NOT_EQUAL_TO_SINGLE:
                {
                alt32=2;
                }
                break;
            case LESS_THAN:
                {
                alt32=3;
                }
                break;
            case LESS_THAN_OR_EQUAL_TO:
                {
                alt32=4;
                }
                break;
            case GREATER_THAN:
                {
                alt32=5;
                }
                break;
            case GREATER_THAN_OR_EQUAL_TO:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:215:7: EQUAL_TO_SINGLE
                    {
                    EQUAL_TO_SINGLE72=(Token)match(input,EQUAL_TO_SINGLE,FOLLOW_EQUAL_TO_SINGLE_in_cmp_operator1729);  
                    stream_EQUAL_TO_SINGLE.add(EQUAL_TO_SINGLE72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:23: -> T_OPERATOR_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_EQUAL_TO_SINGLE, "T_OPERATOR_EQUAL_TO_SINGLE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:216:7: NOT_EQUAL_TO_SINGLE
                    {
                    NOT_EQUAL_TO_SINGLE73=(Token)match(input,NOT_EQUAL_TO_SINGLE,FOLLOW_NOT_EQUAL_TO_SINGLE_in_cmp_operator1741);  
                    stream_NOT_EQUAL_TO_SINGLE.add(NOT_EQUAL_TO_SINGLE73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:27: -> T_OPERATOR_NOT_EQUAL_TO_SINGLE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_NOT_EQUAL_TO_SINGLE, "T_OPERATOR_NOT_EQUAL_TO_SINGLE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:217:7: LESS_THAN
                    {
                    LESS_THAN74=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_cmp_operator1753);  
                    stream_LESS_THAN.add(LESS_THAN74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:17: -> T_OPERATOR_LESS_THAN
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_LESS_THAN, "T_OPERATOR_LESS_THAN"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:218:7: LESS_THAN_OR_EQUAL_TO
                    {
                    LESS_THAN_OR_EQUAL_TO75=(Token)match(input,LESS_THAN_OR_EQUAL_TO,FOLLOW_LESS_THAN_OR_EQUAL_TO_in_cmp_operator1765);  
                    stream_LESS_THAN_OR_EQUAL_TO.add(LESS_THAN_OR_EQUAL_TO75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:29: -> T_OPERATOR_LESS_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_LESS_THAN_OR_EQUAL_TO, "T_OPERATOR_LESS_THAN_OR_EQUAL_TO"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:219:7: GREATER_THAN
                    {
                    GREATER_THAN76=(Token)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_cmp_operator1777);  
                    stream_GREATER_THAN.add(GREATER_THAN76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:20: -> T_OPERATOR_GREATER_THAN
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_GREATER_THAN, "T_OPERATOR_GREATER_THAN"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:220:7: GREATER_THAN_OR_EQUAL_TO
                    {
                    GREATER_THAN_OR_EQUAL_TO77=(Token)match(input,GREATER_THAN_OR_EQUAL_TO,FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_cmp_operator1789);  
                    stream_GREATER_THAN_OR_EQUAL_TO.add(GREATER_THAN_OR_EQUAL_TO77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:32: -> T_OPERATOR_GREATER_THAN_OR_EQUAL_TO
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_GREATER_THAN_OR_EQUAL_TO, "T_OPERATOR_GREATER_THAN_OR_EQUAL_TO"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cmp_operator"

    public static class add_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:223:1: add_expression : (expr1= mul_expression -> $expr1) ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )* ;
    public final SolrqlParser.add_expression_return add_expression() throws RecognitionException {
        SolrqlParser.add_expression_return retval = new SolrqlParser.add_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SolrqlParser.mul_expression_return expr1 = null;

        SolrqlParser.mul_expression_return expr2 = null;

        SolrqlParser.add_operator_return add_operator78 = null;


        RewriteRuleSubtreeStream stream_mul_expression=new RewriteRuleSubtreeStream(adaptor,"rule mul_expression");
        RewriteRuleSubtreeStream stream_add_operator=new RewriteRuleSubtreeStream(adaptor,"rule add_operator");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:224:5: ( (expr1= mul_expression -> $expr1) ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:224:7: (expr1= mul_expression -> $expr1) ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:224:7: (expr1= mul_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:224:8: expr1= mul_expression
            {
            pushFollow(FOLLOW_mul_expression_in_add_expression1813);
            expr1=mul_expression();

            state._fsp--;

            stream_mul_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:29: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:225:7: ( add_operator expr2= mul_expression -> ^( add_operator $add_expression $expr2) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=PLUS && LA33_0<=MINUS)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:225:8: add_operator expr2= mul_expression
            	    {
            	    pushFollow(FOLLOW_add_operator_in_add_expression1828);
            	    add_operator78=add_operator();

            	    state._fsp--;

            	    stream_add_operator.add(add_operator78.getTree());
            	    pushFollow(FOLLOW_mul_expression_in_add_expression1832);
            	    expr2=mul_expression();

            	    state._fsp--;

            	    stream_mul_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: expr2, add_expression, add_operator
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 225:42: -> ^( add_operator $add_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:225:45: ^( add_operator $add_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_add_operator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_expression"

    public static class mul_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:228:1: mul_expression : (expr1= unary_expression -> $expr1) ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )* ;
    public final SolrqlParser.mul_expression_return mul_expression() throws RecognitionException {
        SolrqlParser.mul_expression_return retval = new SolrqlParser.mul_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SolrqlParser.unary_expression_return expr1 = null;

        SolrqlParser.unary_expression_return expr2 = null;

        SolrqlParser.mul_operator_return mul_operator79 = null;


        RewriteRuleSubtreeStream stream_mul_operator=new RewriteRuleSubtreeStream(adaptor,"rule mul_operator");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:229:5: ( (expr1= unary_expression -> $expr1) ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:229:7: (expr1= unary_expression -> $expr1) ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:229:7: (expr1= unary_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:229:8: expr1= unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_mul_expression1866);
            expr1=unary_expression();

            state._fsp--;

            stream_unary_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 229:31: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:230:7: ( mul_operator expr2= unary_expression -> ^( mul_operator $mul_expression $expr2) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASTERISK||LA34_0==SLASH) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:230:8: mul_operator expr2= unary_expression
            	    {
            	    pushFollow(FOLLOW_mul_operator_in_mul_expression1881);
            	    mul_operator79=mul_operator();

            	    state._fsp--;

            	    stream_mul_operator.add(mul_operator79.getTree());
            	    pushFollow(FOLLOW_unary_expression_in_mul_expression1885);
            	    expr2=unary_expression();

            	    state._fsp--;

            	    stream_unary_expression.add(expr2.getTree());


            	    // AST REWRITE
            	    // elements: mul_expression, mul_operator, expr2
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 230:44: -> ^( mul_operator $mul_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:230:47: ^( mul_operator $mul_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_mul_operator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mul_expression"

    public static class where_unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "where_unary_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:233:1: where_unary_expression : ( literal | unary_operator numeric_literal -> ^( unary_operator numeric_literal ) );
    public final SolrqlParser.where_unary_expression_return where_unary_expression() throws RecognitionException {
        SolrqlParser.where_unary_expression_return retval = new SolrqlParser.where_unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SolrqlParser.literal_return literal80 = null;

        SolrqlParser.unary_operator_return unary_operator81 = null;

        SolrqlParser.numeric_literal_return numeric_literal82 = null;


        RewriteRuleSubtreeStream stream_numeric_literal=new RewriteRuleSubtreeStream(adaptor,"rule numeric_literal");
        RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:234:5: ( literal | unary_operator numeric_literal -> ^( unary_operator numeric_literal ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID||LA35_0==STRING||LA35_0==INTEGER||(LA35_0>=FLOAT && LA35_0<=ASTERISK)) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=PLUS && LA35_0<=MINUS)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:234:7: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_where_unary_expression1916);
                    literal80=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal80.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:235:7: unary_operator numeric_literal
                    {
                    pushFollow(FOLLOW_unary_operator_in_where_unary_expression1924);
                    unary_operator81=unary_operator();

                    state._fsp--;

                    stream_unary_operator.add(unary_operator81.getTree());
                    pushFollow(FOLLOW_numeric_literal_in_where_unary_expression1926);
                    numeric_literal82=numeric_literal();

                    state._fsp--;

                    stream_numeric_literal.add(numeric_literal82.getTree());


                    // AST REWRITE
                    // elements: numeric_literal, unary_operator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:7: -> ^( unary_operator numeric_literal )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:236:10: ^( unary_operator numeric_literal )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_unary_operator.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_numeric_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "where_unary_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:239:1: unary_expression : ( postfix_expression | unary_operator unary_expression -> ^( unary_operator unary_expression ) );
    public final SolrqlParser.unary_expression_return unary_expression() throws RecognitionException {
        SolrqlParser.unary_expression_return retval = new SolrqlParser.unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SolrqlParser.postfix_expression_return postfix_expression83 = null;

        SolrqlParser.unary_operator_return unary_operator84 = null;

        SolrqlParser.unary_expression_return unary_expression85 = null;


        RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:240:5: ( postfix_expression | unary_operator unary_expression -> ^( unary_operator unary_expression ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ID||LA36_0==STRING||LA36_0==LPAREN||LA36_0==INTEGER||LA36_0==LSBRACKET||(LA36_0>=FLOAT && LA36_0<=ASTERISK)) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=PLUS && LA36_0<=MINUS)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:240:7: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1957);
                    postfix_expression83=postfix_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expression83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:241:7: unary_operator unary_expression
                    {
                    pushFollow(FOLLOW_unary_operator_in_unary_expression1965);
                    unary_operator84=unary_operator();

                    state._fsp--;

                    stream_unary_operator.add(unary_operator84.getTree());
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1967);
                    unary_expression85=unary_expression();

                    state._fsp--;

                    stream_unary_expression.add(unary_expression85.getTree());


                    // AST REWRITE
                    // elements: unary_expression, unary_operator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:7: -> ^( unary_operator unary_expression )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:242:10: ^( unary_operator unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_unary_operator.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:245:1: postfix_expression : (expr1= atom_expression -> $expr1) ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )* ;
    public final SolrqlParser.postfix_expression_return postfix_expression() throws RecognitionException {
        SolrqlParser.postfix_expression_return retval = new SolrqlParser.postfix_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LSBRACKET86=null;
        Token RSBRACKET87=null;
        Token LPAREN88=null;
        Token RPAREN90=null;
        SolrqlParser.atom_expression_return expr1 = null;

        SolrqlParser.expression_return expr2 = null;

        SolrqlParser.argument_list_return argument_list89 = null;


        Object LSBRACKET86_tree=null;
        Object RSBRACKET87_tree=null;
        Object LPAREN88_tree=null;
        Object RPAREN90_tree=null;
        RewriteRuleTokenStream stream_LSBRACKET=new RewriteRuleTokenStream(adaptor,"token LSBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RSBRACKET=new RewriteRuleTokenStream(adaptor,"token RSBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_atom_expression=new RewriteRuleSubtreeStream(adaptor,"rule atom_expression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_list");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:246:5: ( (expr1= atom_expression -> $expr1) ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:246:7: (expr1= atom_expression -> $expr1) ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )*
            {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:246:7: (expr1= atom_expression -> $expr1)
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:246:8: expr1= atom_expression
            {
            pushFollow(FOLLOW_atom_expression_in_postfix_expression2001);
            expr1=atom_expression();

            state._fsp--;

            stream_atom_expression.add(expr1.getTree());


            // AST REWRITE
            // elements: expr1
            // token labels: 
            // rule labels: retval, expr1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:30: -> $expr1
            {
                adaptor.addChild(root_0, stream_expr1.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:247:7: ( LSBRACKET expr2= expression RSBRACKET -> ^( T_OPERATOR_INDEX $postfix_expression $expr2) | LPAREN ( argument_list )? RPAREN -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LSBRACKET) ) {
                    alt38=1;
                }
                else if ( (LA38_0==LPAREN) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:247:9: LSBRACKET expr2= expression RSBRACKET
            	    {
            	    LSBRACKET86=(Token)match(input,LSBRACKET,FOLLOW_LSBRACKET_in_postfix_expression2017);  
            	    stream_LSBRACKET.add(LSBRACKET86);

            	    pushFollow(FOLLOW_expression_in_postfix_expression2021);
            	    expr2=expression();

            	    state._fsp--;

            	    stream_expression.add(expr2.getTree());
            	    RSBRACKET87=(Token)match(input,RSBRACKET,FOLLOW_RSBRACKET_in_postfix_expression2023);  
            	    stream_RSBRACKET.add(RSBRACKET87);



            	    // AST REWRITE
            	    // elements: postfix_expression, expr2
            	    // token labels: 
            	    // rule labels: retval, expr2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 248:9: -> ^( T_OPERATOR_INDEX $postfix_expression $expr2)
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:248:12: ^( T_OPERATOR_INDEX $postfix_expression $expr2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_INDEX, "T_OPERATOR_INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expr2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:249:9: LPAREN ( argument_list )? RPAREN
            	    {
            	    LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2053);  
            	    stream_LPAREN.add(LPAREN88);

            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:249:16: ( argument_list )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==ID||LA37_0==STRING||LA37_0==LPAREN||LA37_0==INTEGER||LA37_0==LSBRACKET||(LA37_0>=FLOAT && LA37_0<=MINUS)) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:249:16: argument_list
            	            {
            	            pushFollow(FOLLOW_argument_list_in_postfix_expression2055);
            	            argument_list89=argument_list();

            	            state._fsp--;

            	            stream_argument_list.add(argument_list89.getTree());

            	            }
            	            break;

            	    }

            	    RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2058);  
            	    stream_RPAREN.add(RPAREN90);



            	    // AST REWRITE
            	    // elements: postfix_expression, argument_list
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 250:9: -> ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? )
            	    {
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:250:12: ^( T_OPERATOR_CALL $postfix_expression ( argument_list )? )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_OPERATOR_CALL, "T_OPERATOR_CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:250:50: ( argument_list )?
            	        if ( stream_argument_list.hasNext() ) {
            	            adaptor.addChild(root_1, stream_argument_list.nextTree());

            	        }
            	        stream_argument_list.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class atom_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_expression"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:254:1: atom_expression : ( literal | LSBRACKET ( argument_list )? RSBRACKET -> ^( T_LIST ( argument_list )? ) | LPAREN expression RPAREN );
    public final SolrqlParser.atom_expression_return atom_expression() throws RecognitionException {
        SolrqlParser.atom_expression_return retval = new SolrqlParser.atom_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LSBRACKET92=null;
        Token RSBRACKET94=null;
        Token LPAREN95=null;
        Token RPAREN97=null;
        SolrqlParser.literal_return literal91 = null;

        SolrqlParser.argument_list_return argument_list93 = null;

        SolrqlParser.expression_return expression96 = null;


        Object LSBRACKET92_tree=null;
        Object RSBRACKET94_tree=null;
        Object LPAREN95_tree=null;
        Object RPAREN97_tree=null;
        RewriteRuleTokenStream stream_LSBRACKET=new RewriteRuleTokenStream(adaptor,"token LSBRACKET");
        RewriteRuleTokenStream stream_RSBRACKET=new RewriteRuleTokenStream(adaptor,"token RSBRACKET");
        RewriteRuleSubtreeStream stream_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_list");
        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:255:5: ( literal | LSBRACKET ( argument_list )? RSBRACKET -> ^( T_LIST ( argument_list )? ) | LPAREN expression RPAREN )
            int alt40=3;
            switch ( input.LA(1) ) {
            case ID:
            case STRING:
            case INTEGER:
            case FLOAT:
            case TRUE:
            case FALSE:
            case NULL:
            case ASTERISK:
                {
                alt40=1;
                }
                break;
            case LSBRACKET:
                {
                alt40=2;
                }
                break;
            case LPAREN:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:255:7: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_atom_expression2104);
                    literal91=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal91.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:256:7: LSBRACKET ( argument_list )? RSBRACKET
                    {
                    LSBRACKET92=(Token)match(input,LSBRACKET,FOLLOW_LSBRACKET_in_atom_expression2112);  
                    stream_LSBRACKET.add(LSBRACKET92);

                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:256:17: ( argument_list )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==ID||LA39_0==STRING||LA39_0==LPAREN||LA39_0==INTEGER||LA39_0==LSBRACKET||(LA39_0>=FLOAT && LA39_0<=MINUS)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:256:17: argument_list
                            {
                            pushFollow(FOLLOW_argument_list_in_atom_expression2114);
                            argument_list93=argument_list();

                            state._fsp--;

                            stream_argument_list.add(argument_list93.getTree());

                            }
                            break;

                    }

                    RSBRACKET94=(Token)match(input,RSBRACKET,FOLLOW_RSBRACKET_in_atom_expression2117);  
                    stream_RSBRACKET.add(RSBRACKET94);



                    // AST REWRITE
                    // elements: argument_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 257:7: -> ^( T_LIST ( argument_list )? )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:257:10: ^( T_LIST ( argument_list )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_LIST, "T_LIST"), root_1);

                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:257:19: ( argument_list )?
                        if ( stream_argument_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_argument_list.nextTree());

                        }
                        stream_argument_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:258:7: LPAREN expression RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expression2140); 
                    pushFollow(FOLLOW_expression_in_atom_expression2143);
                    expression96=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression96.getTree());
                    RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expression2145); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom_expression"

    public static class argument_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_list"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:261:1: argument_list : expression ( COMMA expression )* ;
    public final SolrqlParser.argument_list_return argument_list() throws RecognitionException {
        SolrqlParser.argument_list_return retval = new SolrqlParser.argument_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA99=null;
        SolrqlParser.expression_return expression98 = null;

        SolrqlParser.expression_return expression100 = null;


        Object COMMA99_tree=null;

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:262:5: ( expression ( COMMA expression )* )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:262:7: expression ( COMMA expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_argument_list2163);
            expression98=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression98.getTree());
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:262:18: ( COMMA expression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:262:19: COMMA expression
            	    {
            	    COMMA99=(Token)match(input,COMMA,FOLLOW_COMMA_in_argument_list2166); 
            	    pushFollow(FOLLOW_expression_in_argument_list2169);
            	    expression100=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression100.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument_list"

    public static class numeric_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric_literal"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:265:1: numeric_literal : ( INTEGER | FLOAT );
    public final SolrqlParser.numeric_literal_return numeric_literal() throws RecognitionException {
        SolrqlParser.numeric_literal_return retval = new SolrqlParser.numeric_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set101=null;

        Object set101_tree=null;

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:266:5: ( INTEGER | FLOAT )
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:
            {
            root_0 = (Object)adaptor.nil();

            set101=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==FLOAT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set101));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_literal"

    public static class value_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value_literal"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:270:1: value_literal : ( TRUE | FALSE | STRING | numeric_literal | NULL );
    public final SolrqlParser.value_literal_return value_literal() throws RecognitionException {
        SolrqlParser.value_literal_return retval = new SolrqlParser.value_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRUE102=null;
        Token FALSE103=null;
        Token STRING104=null;
        Token NULL106=null;
        SolrqlParser.numeric_literal_return numeric_literal105 = null;


        Object TRUE102_tree=null;
        Object FALSE103_tree=null;
        Object STRING104_tree=null;
        Object NULL106_tree=null;

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:271:5: ( TRUE | FALSE | STRING | numeric_literal | NULL )
            int alt42=5;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt42=1;
                }
                break;
            case FALSE:
                {
                alt42=2;
                }
                break;
            case STRING:
                {
                alt42=3;
                }
                break;
            case INTEGER:
            case FLOAT:
                {
                alt42=4;
                }
                break;
            case NULL:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:271:7: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE102=(Token)match(input,TRUE,FOLLOW_TRUE_in_value_literal2213); 
                    TRUE102_tree = (Object)adaptor.create(TRUE102);
                    adaptor.addChild(root_0, TRUE102_tree);


                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:272:7: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE103=(Token)match(input,FALSE,FOLLOW_FALSE_in_value_literal2221); 
                    FALSE103_tree = (Object)adaptor.create(FALSE103);
                    adaptor.addChild(root_0, FALSE103_tree);


                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:273:7: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING104=(Token)match(input,STRING,FOLLOW_STRING_in_value_literal2229); 
                    STRING104_tree = (Object)adaptor.create(STRING104);
                    adaptor.addChild(root_0, STRING104_tree);


                    }
                    break;
                case 4 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:274:7: numeric_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numeric_literal_in_value_literal2237);
                    numeric_literal105=numeric_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric_literal105.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:275:7: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL106=(Token)match(input,NULL,FOLLOW_NULL_in_value_literal2245); 
                    NULL106_tree = (Object)adaptor.create(NULL106);
                    adaptor.addChild(root_0, NULL106_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value_literal"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:278:1: literal : ( ID | ASTERISK | value_literal );
    public final SolrqlParser.literal_return literal() throws RecognitionException {
        SolrqlParser.literal_return retval = new SolrqlParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID107=null;
        Token ASTERISK108=null;
        SolrqlParser.value_literal_return value_literal109 = null;


        Object ID107_tree=null;
        Object ASTERISK108_tree=null;

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:279:5: ( ID | ASTERISK | value_literal )
            int alt43=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt43=1;
                }
                break;
            case ASTERISK:
                {
                alt43=2;
                }
                break;
            case STRING:
            case INTEGER:
            case FLOAT:
            case TRUE:
            case FALSE:
            case NULL:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:279:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID107=(Token)match(input,ID,FOLLOW_ID_in_literal2262); 
                    ID107_tree = (Object)adaptor.create(ID107);
                    adaptor.addChild(root_0, ID107_tree);


                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:280:7: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK108=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_literal2270); 
                    ASTERISK108_tree = (Object)adaptor.create(ASTERISK108);
                    adaptor.addChild(root_0, ASTERISK108_tree);


                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:281:7: value_literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_literal_in_literal2278);
                    value_literal109=value_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, value_literal109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class unary_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_operator"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:284:1: unary_operator : ( PLUS -> T_OPERATOR_PLUS | MINUS -> T_OPERATOR_MINUS );
    public final SolrqlParser.unary_operator_return unary_operator() throws RecognitionException {
        SolrqlParser.unary_operator_return retval = new SolrqlParser.unary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS110=null;
        Token MINUS111=null;

        Object PLUS110_tree=null;
        Object MINUS111_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:285:5: ( PLUS -> T_OPERATOR_PLUS | MINUS -> T_OPERATOR_MINUS )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PLUS) ) {
                alt44=1;
            }
            else if ( (LA44_0==MINUS) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:285:7: PLUS
                    {
                    PLUS110=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_operator2295);  
                    stream_PLUS.add(PLUS110);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:12: -> T_OPERATOR_PLUS
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_PLUS, "T_OPERATOR_PLUS"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:286:7: MINUS
                    {
                    MINUS111=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_operator2307);  
                    stream_MINUS.add(MINUS111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 286:13: -> T_OPERATOR_MINUS
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_MINUS, "T_OPERATOR_MINUS"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_operator"

    public static class add_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_operator"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:289:1: add_operator : ( PLUS -> T_OPERATOR_ADD | MINUS -> T_OPERATOR_SUBTRACT );
    public final SolrqlParser.add_operator_return add_operator() throws RecognitionException {
        SolrqlParser.add_operator_return retval = new SolrqlParser.add_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS112=null;
        Token MINUS113=null;

        Object PLUS112_tree=null;
        Object MINUS113_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:290:5: ( PLUS -> T_OPERATOR_ADD | MINUS -> T_OPERATOR_SUBTRACT )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==PLUS) ) {
                alt45=1;
            }
            else if ( (LA45_0==MINUS) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:290:7: PLUS
                    {
                    PLUS112=(Token)match(input,PLUS,FOLLOW_PLUS_in_add_operator2328);  
                    stream_PLUS.add(PLUS112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 290:12: -> T_OPERATOR_ADD
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_ADD, "T_OPERATOR_ADD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:291:7: MINUS
                    {
                    MINUS113=(Token)match(input,MINUS,FOLLOW_MINUS_in_add_operator2340);  
                    stream_MINUS.add(MINUS113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 291:13: -> T_OPERATOR_SUBTRACT
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_SUBTRACT, "T_OPERATOR_SUBTRACT"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_operator"

    public static class mul_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_operator"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:294:1: mul_operator : ( ASTERISK -> T_OPERATOR_MULTIPLY | SLASH -> T_OPERATOR_DIVIDE );
    public final SolrqlParser.mul_operator_return mul_operator() throws RecognitionException {
        SolrqlParser.mul_operator_return retval = new SolrqlParser.mul_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK114=null;
        Token SLASH115=null;

        Object ASTERISK114_tree=null;
        Object SLASH115_tree=null;
        RewriteRuleTokenStream stream_SLASH=new RewriteRuleTokenStream(adaptor,"token SLASH");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:295:5: ( ASTERISK -> T_OPERATOR_MULTIPLY | SLASH -> T_OPERATOR_DIVIDE )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ASTERISK) ) {
                alt46=1;
            }
            else if ( (LA46_0==SLASH) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:295:7: ASTERISK
                    {
                    ASTERISK114=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_mul_operator2361);  
                    stream_ASTERISK.add(ASTERISK114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 295:16: -> T_OPERATOR_MULTIPLY
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_MULTIPLY, "T_OPERATOR_MULTIPLY"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:296:7: SLASH
                    {
                    SLASH115=(Token)match(input,SLASH,FOLLOW_SLASH_in_mul_operator2373);  
                    stream_SLASH.add(SLASH115);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 296:13: -> T_OPERATOR_DIVIDE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(T_OPERATOR_DIVIDE, "T_OPERATOR_DIVIDE"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mul_operator"

    public static class ordering_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordering_term"
    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:299:1: ordering_term : ( ID ASC -> ^( T_ORDERING ^( T_ASC ID ) ) | ID DESC -> ^( T_ORDERING ^( T_DESC ID ) ) | ID -> ^( T_ORDERING ^( T_ASC ID ) ) );
    public final SolrqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SolrqlParser.ordering_term_return retval = new SolrqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID116=null;
        Token ASC117=null;
        Token ID118=null;
        Token DESC119=null;
        Token ID120=null;

        Object ID116_tree=null;
        Object ASC117_tree=null;
        Object ID118_tree=null;
        Object DESC119_tree=null;
        Object ID120_tree=null;
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:300:5: ( ID ASC -> ^( T_ORDERING ^( T_ASC ID ) ) | ID DESC -> ^( T_ORDERING ^( T_DESC ID ) ) | ID -> ^( T_ORDERING ^( T_ASC ID ) ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID) ) {
                switch ( input.LA(2) ) {
                case ASC:
                    {
                    alt47=1;
                    }
                    break;
                case DESC:
                    {
                    alt47=2;
                    }
                    break;
                case SEMICOLON:
                case COMMA:
                case LIMIT:
                    {
                    alt47=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:300:7: ID ASC
                    {
                    ID116=(Token)match(input,ID,FOLLOW_ID_in_ordering_term2394);  
                    stream_ID.add(ID116);

                    ASC117=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term2396);  
                    stream_ASC.add(ASC117);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:14: -> ^( T_ORDERING ^( T_ASC ID ) )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:300:17: ^( T_ORDERING ^( T_ASC ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ORDERING, "T_ORDERING"), root_1);

                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:300:30: ^( T_ASC ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ASC, "T_ASC"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:301:7: ID DESC
                    {
                    ID118=(Token)match(input,ID,FOLLOW_ID_in_ordering_term2416);  
                    stream_ID.add(ID118);

                    DESC119=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term2418);  
                    stream_DESC.add(DESC119);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:15: -> ^( T_ORDERING ^( T_DESC ID ) )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:301:18: ^( T_ORDERING ^( T_DESC ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ORDERING, "T_ORDERING"), root_1);

                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:301:31: ^( T_DESC ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_DESC, "T_DESC"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:302:7: ID
                    {
                    ID120=(Token)match(input,ID,FOLLOW_ID_in_ordering_term2438);  
                    stream_ID.add(ID120);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:10: -> ^( T_ORDERING ^( T_ASC ID ) )
                    {
                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:302:13: ^( T_ORDERING ^( T_ASC ID ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ORDERING, "T_ORDERING"), root_1);

                        // C:\\Home\\src\\workspace\\solrql\\grammar\\Solrql.g:302:26: ^( T_ASC ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_ASC, "T_ASC"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException e) {
            throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ordering_term"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmt_core_in_stmt_list376 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_stmt_list378 = new BitSet(new long[]{0x014E800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_EOF_in_stmt_list383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_stmt_core401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_stmt_core409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_stmt_core417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_use_stmt_in_stmt_core425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_stmt_core433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_stmt_core441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimize_stmt_in_stmt_core449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIMIZE_in_optimize_stmt466 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_optimize_stmt468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt517 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_rollback_stmt519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit_stmt568 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ID_in_commit_stmt570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use_stmt619 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_in_use_stmt623 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AS_in_use_stmt626 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_use_stmt630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt692 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt695 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_delete_stmt699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_where_clause_in_delete_stmt703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt760 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt763 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt767 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt771 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt775 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt778 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_insert_stmt782 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt786 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt796 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt798 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_expression_in_insert_stmt800 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt803 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_expression_in_insert_stmt805 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_stmt899 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt902 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_BY_in_select_stmt904 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt906 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt909 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt911 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1008 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_result_field_in_select_core1010 = new BitSet(new long[]{0x0880000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_COMMA_in_select_core1013 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_result_field_in_select_core1015 = new BitSet(new long[]{0x0880000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_FROM_in_select_core1020 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_select_core1024 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_where_clause_in_select_core1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause1092 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_where_expression_in_where_clause1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NWHERE_in_where_clause1118 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_in_where_clause1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_result_field1151 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_AS_in_result_field1154 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_result_field1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_and_expression_in_where_expression1199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_in_where_expression1214 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_where_and_expression_in_where_expression1218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_and_expression_in_expression1252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_OR_in_expression1267 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_and_expression_in_expression1271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_where_not_expression_in_where_and_expression1305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_AND_in_where_and_expression1320 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_where_not_expression_in_where_and_expression1324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_not_expression_in_and_expression1358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_AND_in_and_expression1373 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_not_expression_in_and_expression1377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_where_cmp_expression_in_where_not_expression1411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_NOT_in_where_not_expression1426 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_where_cmp_expression_in_where_not_expression1430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_cmp_expression_in_not_expression1464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_NOT_in_not_expression1479 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_cmp_expression_in_not_expression1483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_where_unary_expression_in_where_cmp_expression1516 = new BitSet(new long[]{0x0000000000000000L,0x000000000001FE00L});
    public static final BitSet FOLLOW_where_cmp_operator_in_where_cmp_expression1518 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_where_unary_expression_in_where_cmp_expression1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_where_cmp_expression1548 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_where_expression_in_where_cmp_expression1551 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_where_cmp_expression1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_expression_in_cmp_expression1574 = new BitSet(new long[]{0x0000000000000002L,0x000000000001EA00L});
    public static final BitSet FOLLOW_cmp_operator_in_cmp_expression1589 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_add_expression_in_cmp_expression1593 = new BitSet(new long[]{0x0000000000000002L,0x000000000001EA00L});
    public static final BitSet FOLLOW_EQUAL_TO_SINGLE_in_where_cmp_operator1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_TO_DOUBLE_in_where_cmp_operator1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_TO_SINGLE_in_where_cmp_operator1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_TO_DOUBLE_in_where_cmp_operator1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_where_cmp_operator1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUAL_TO_in_where_cmp_operator1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_in_where_cmp_operator1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_where_cmp_operator1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_TO_SINGLE_in_cmp_operator1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_TO_SINGLE_in_cmp_operator1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_in_cmp_operator1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUAL_TO_in_cmp_operator1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_in_cmp_operator1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUAL_TO_in_cmp_operator1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mul_expression_in_add_expression1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_add_operator_in_add_expression1828 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_mul_expression_in_add_expression1832 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_unary_expression_in_mul_expression1866 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800000L});
    public static final BitSet FOLLOW_mul_operator_in_mul_expression1881 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_unary_expression_in_mul_expression1885 = new BitSet(new long[]{0x0000000000000002L,0x0000000004800000L});
    public static final BitSet FOLLOW_literal_in_where_unary_expression1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_where_unary_expression1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080002L});
    public static final BitSet FOLLOW_numeric_literal_in_where_unary_expression1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression1965 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expression_in_postfix_expression2001 = new BitSet(new long[]{0x0400000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_LSBRACKET_in_postfix_expression2017 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_expression_in_postfix_expression2021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RSBRACKET_in_postfix_expression2023 = new BitSet(new long[]{0x0400000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2053 = new BitSet(new long[]{0x1411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_argument_list_in_postfix_expression2055 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2058 = new BitSet(new long[]{0x0400000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_literal_in_atom_expression2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSBRACKET_in_atom_expression2112 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FE0002L});
    public static final BitSet FOLLOW_argument_list_in_atom_expression2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RSBRACKET_in_atom_expression2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expression2140 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_expression_in_atom_expression2143 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expression2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_argument_list2163 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_COMMA_in_argument_list2166 = new BitSet(new long[]{0x0411000000000000L,0x0000000003FA0002L});
    public static final BitSet FOLLOW_expression_in_argument_list2169 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_set_in_numeric_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_value_literal2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_value_literal2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value_literal2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_value_literal2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value_literal2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_literal2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_literal2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_literal_in_literal2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_operator2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_operator2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_add_operator2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_add_operator2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_mul_operator2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_mul_operator2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ordering_term2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ASC_in_ordering_term2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ordering_term2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DESC_in_ordering_term2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ordering_term2438 = new BitSet(new long[]{0x0000000000000002L});

}