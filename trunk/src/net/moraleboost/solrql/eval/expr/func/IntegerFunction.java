package net.moraleboost.solrql.eval.expr.func;

import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class IntegerFunction extends BaseFunction
{
    public IntegerFunction()
    {
        super();
    }

    @Override
    public Integer call(List<Object> arguments, EvalContext ctx)
            throws EvalException
    {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToInteger((Number)arg);
            } else if (isString(arg)) {
                try {
                    return Integer.parseInt((String)arg);
                } catch (Exception e) {
                    throw new EvalException(e);
                }
            } else {
                throw new EvalException(
                        "Can't convert " + arg.getClass().getCanonicalName() +
                        " to an Integer.");
            }
        } else {
            throw new EvalException("INTEGER function must take 1 argument.");
        }
    }
}
