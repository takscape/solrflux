package net.moraleboost.solrql.eval.expr.func;

import java.math.BigDecimal;
import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class BigDecimalFunction extends BaseFunction
{
    public BigDecimalFunction()
    {
        super();
    }

    @Override
    public BigDecimal call(List<Object> arguments, EvalContext ctx)
            throws EvalException
    {
        if (arguments.size() == 1) {
            Object arg = arguments.get(0);
            if (arg == null) {
                return null;
            } else if (isNumber(arg)) {
                return convertToBigDecimal((Number)arg);
            } else if (isString(arg)) {
                try {
                    return new BigDecimal((String)arg);
                } catch (Exception e) {
                    throw new EvalException(e);
                }
            } else {
                throw new EvalException(
                        "Can't convert " + arg.getClass().getCanonicalName() +
                        " to a BigDecimal.");
            }
        } else {
            throw new EvalException("BIGDECIMAL function must take 1 argument.");
        }
    }
}
