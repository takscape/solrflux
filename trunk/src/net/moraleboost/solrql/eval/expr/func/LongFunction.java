package net.moraleboost.solrql.eval.expr.func;

import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class LongFunction extends BaseFunction
{
    public LongFunction()
    {
        super();
    }
    
    @Override
    public Long call(List<Object> arguments, EvalContext ctx)
            throws EvalException
    {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToLong((Number)arg);
            } else if (isString(arg)) {
                try {
                    return Long.parseLong((String)arg);
                } catch (Exception e) {
                    throw new EvalException(e);
                }
            } else {
                throw new EvalException(
                        "Can't convert " + arg.getClass().getCanonicalName() +
                        " to a Long.");
            }
        } else {
            throw new EvalException("LONG function must take 1 argument.");
        }
    }
}
