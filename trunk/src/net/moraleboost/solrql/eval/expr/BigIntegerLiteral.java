package net.moraleboost.solrql.eval.expr;

import java.math.BigInteger;

import org.apache.solr.client.solrj.util.ClientUtils;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

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
