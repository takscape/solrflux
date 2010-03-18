package net.moraleboost.solrql.eval.expr;

import java.util.Map;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

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
