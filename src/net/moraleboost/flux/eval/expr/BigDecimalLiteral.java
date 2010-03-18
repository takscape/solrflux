package net.moraleboost.flux.eval.expr;

import java.math.BigDecimal;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class BigDecimalLiteral extends NumberLiteralExpression
{
    private BigDecimal value;
    
    public BigDecimalLiteral(BigDecimal value)
    {
        super();
        this.value = value;
    }

    @Override
    public boolean isNegativeValue()
    {
        return (value.compareTo(BigDecimal.ZERO) < 0);
    }

    public BigDecimal evaluate(EvalContext ctx) throws EvalException
    {
        return value;
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        return ClientUtils.escapeQueryChars(value.toString());
    }
}
