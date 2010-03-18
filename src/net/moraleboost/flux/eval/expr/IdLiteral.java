package net.moraleboost.flux.eval.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class IdLiteral extends LiteralExpression
{
    private String value;
    
    public IdLiteral(String value)
    {
        super();
        this.value = value;
    }
    
    public String getValue()
    {
        return value;
    }

    public Object evaluate(EvalContext ctx) throws EvalException
    {
        return ctx.get(value);
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        return ClientUtils.escapeQueryChars(value);
    }
}
