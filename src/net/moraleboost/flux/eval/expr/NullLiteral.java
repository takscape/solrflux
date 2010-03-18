package net.moraleboost.flux.eval.expr;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

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
