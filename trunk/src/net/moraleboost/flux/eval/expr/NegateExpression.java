package net.moraleboost.flux.eval.expr;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;
import net.moraleboost.flux.eval.Expression;
import net.moraleboost.flux.eval.expr.arith.Negate;

public class NegateExpression extends UnaryOperatorExpression
{
    public NegateExpression()
    {
        super();
    }
    
    @Override
    protected Object evaluateInner(Object o, EvalContext ctx)
    throws EvalException
    {
        if (isNumber(o)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number)o, ctx, Negate.INSTANCE);
        }
        
        throw new EvalException("Operand has an incompatible type.");
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        // operandがNumberLiteralであった場合は、"-"を前置/除去する。
        // そうでない場合、例外
        Expression operand = getOperand();
        if (isNumberLiteralExpression(operand)) {
            String q = operand.toSolrQuery(ctx);
            if (((NumberLiteralExpression)operand).isNegativeValue()) {
                // 先頭の "\\-"を除去
                if (q.startsWith("\\-")) {
                    return q.substring(2);
                } else if (q.startsWith("-") ) {
                    return q.substring(1);
                } else {
                    // negative but not prefixed with "-"
                    return q;
                }
            } else {
                return "\\-" + operand.toSolrQuery(ctx);
            }
        } else {
            throw new EvalException("Operator \"-\" can only be applied to number literals.");
        }
    }
}
