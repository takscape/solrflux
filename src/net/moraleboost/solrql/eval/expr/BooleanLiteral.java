package net.moraleboost.solrql.eval.expr;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

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
