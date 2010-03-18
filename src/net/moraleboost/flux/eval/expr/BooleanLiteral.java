package net.moraleboost.flux.eval.expr;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class BooleanLiteral extends LiteralExpression
{
    private Boolean value;
    
    public BooleanLiteral(Boolean value)
    {
        this.value = value;
    }
    
    public Boolean evaluate(EvalContext ctx)
    {
        return value;
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        if (value) {
            return "true";
        } else {
            return "false";
        }
    }
}
