package net.moraleboost.flux.eval.expr;

import java.math.BigInteger;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class BigIntegerLiteral extends NumberLiteralExpression
{
    private BigInteger value;
    
    public BigIntegerLiteral(BigInteger value)
    {
        super();
        this.value = value;
    }

    public BigInteger evaluate(EvalContext ctx) throws EvalException
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
        return (value.compareTo(BigInteger.ZERO) < 0);
    }
}
