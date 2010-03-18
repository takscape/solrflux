package net.moraleboost.solrql.eval.expr.func;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class LengthFunction extends BaseFunction
{
    public LengthFunction()
    {
        super();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Integer call(List<Object> arguments, EvalContext ctx)
            throws EvalException
    {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                throw new EvalException("Argument is NULL.");
            } else if (isArray(arg)) {
                return Array.getLength(arg);
            } else if (isCollection(arg)) {
                return ((Collection)arg).size();
            } else if (isString(arg)) {
                return ((String)arg).length();
            } else {
                throw new EvalException(
                        "Can't get length of " +
                        arg.getClass().getCanonicalName());
            }
        } else {
            throw new EvalException("LENGTH function must take 1 argument.");
        }
    }
}
