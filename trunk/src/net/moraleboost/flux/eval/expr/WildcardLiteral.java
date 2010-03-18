package net.moraleboost.flux.eval.expr;

import java.util.Map;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class WildcardLiteral extends LiteralExpression
{
    public WildcardLiteral()
    {
        super();
    }
    
    public Map<String, Object> evaluate(EvalContext ctx) throws EvalException
    {
        return ctx.getNamespace();
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        return "*";
    }
}
