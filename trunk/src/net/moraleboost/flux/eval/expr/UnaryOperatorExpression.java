package net.moraleboost.flux.eval.expr;

import java.math.BigDecimal;
import java.math.BigInteger;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;
import net.moraleboost.flux.eval.Expression;
import net.moraleboost.flux.eval.expr.arith.UnaryOperator;

public abstract class UnaryOperatorExpression extends BaseExpression
{
    private Expression operand;
    
    public UnaryOperatorExpression()
    {
        super();
    }

    public void setOperand(Expression operand)
    {
        this.operand = operand;
    }

    public Expression getOperand()
    {
        return operand;
    }

    public Object evaluate(EvalContext ctx) throws EvalException
    {
        if (operand == null) {
            throw new EvalException("Missing operand.");
        }
        
        Object o = operand.evaluate(ctx);
        
        return evaluateInner(o, ctx);
    }

    protected abstract Object evaluateInner(Object o, EvalContext ctx) throws EvalException;

    protected Object evaluateArithmeticCalculation(Number o, EvalContext ctx, UnaryOperator op)
    throws EvalException
    {
        if (isBigDecimal(o)) {
            return op.doBigDecimal((BigDecimal)o);
        } else if (isBigInteger(o)) {
            return op.doBigInteger((BigInteger)o);
        } else if (isDouble(o)) {
            return op.doDouble((Double)o);
        } else if (isFloat(o)) {
            return op.doFloat((Float)o);
        } else if (isLong(o)) {
            return op.doLong((Long)o);
        } else if (isInteger(o)) {
            return op.doInteger((Integer)o);
        } else {
            return op.doLong(convertToLong(o));
        }
    }
}
