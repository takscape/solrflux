package net.moraleboost.solrql.eval.expr;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class NullLiteral extends LiteralExpression
{
    public NullLiteral()
    {
        super();
    }

    public Object evaluate(EvalContext ctx) throws EvalException
    {
        return null;
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        throw new EvalException("Unexpected NULL literal.");
    }
}
