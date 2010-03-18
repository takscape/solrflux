package net.moraleboost.solrql.eval.expr.func;

import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;
import net.moraleboost.solrql.eval.Expression;

public interface Function extends Expression
{
    public Object call(List<Object> arguments, EvalContext ctx) throws EvalException;
}
