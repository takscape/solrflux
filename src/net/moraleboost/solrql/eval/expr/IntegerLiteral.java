package net.moraleboost.solrql.eval.expr;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class IntegerLiteral extends NumberLiteralExpression
{
    private Integer value;
    
    public IntegerLiteral(Integer value)
    {
        super();
        this.value = value;
    }

    public Integer evaluate(EvalContext ctx) throws EvalException
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
