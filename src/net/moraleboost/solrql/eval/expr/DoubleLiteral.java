package net.moraleboost.solrql.eval.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class DoubleLiteral extends NumberLiteralExpression
{
    private Double value;
    
    public DoubleLiteral(Double value)
    {
        this.value = value;
    }

    public Double evaluate(EvalContext ctx) throws EvalException
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