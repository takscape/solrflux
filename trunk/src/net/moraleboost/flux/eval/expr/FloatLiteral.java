package net.moraleboost.flux.eval.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class FloatLiteral extends NumberLiteralExpression
{
    private Float value;
    
    public FloatLiteral(Float value)
    {
        this.value = value;
    }

    public Float evaluate(EvalContext ctx) throws EvalException
    {
        return value;
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        return ClientUtils.escapeQueryChars(value.toString());
    }

    @Override
    public boolean isNegativeValue()
    {
        return (value < 0);
    }
}
