package net.moraleboost.flux.eval.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class StringLiteral extends LiteralExpression
{
    private String value;
    
    public StringLiteral(String value)
    {
        super();
        this.value = value;
    }

    public String evaluate(EvalContext ctx)
    {
        return value;
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        return ClientUtils.escapeQueryChars(value);
    }
}
