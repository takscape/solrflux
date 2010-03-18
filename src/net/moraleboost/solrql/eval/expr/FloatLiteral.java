package net.moraleboost.solrql.eval.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

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
