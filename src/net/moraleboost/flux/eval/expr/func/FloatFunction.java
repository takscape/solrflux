package net.moraleboost.flux.eval.expr.func;

import java.util.List;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class FloatFunction extends BaseFunction
{
    public FloatFunction()
    {
        super();
    }

    @Override
    public Float call(List<Object> arguments, EvalContext ctx)
            throws EvalException
    {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToFloat((Number)arg);
            } else if (isString(arg)) {
                try {
                    return Float.parseFloat((String)arg);
                } catch (Exception e) {
                    throw new EvalException(e);
                }
            } else {
                throw new EvalException(
                        "Can't convert " + arg.getClass().getCanonicalName() +
                        " to a Float.");
            }
        } else {
            throw new EvalException("FLOAT function must take 1 argument.");
        }
    }
}
