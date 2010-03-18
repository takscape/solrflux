package net.moraleboost.solrql.eval.expr;

import java.lang.reflect.Array;
import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;
import net.moraleboost.solrql.eval.Expression;

public class IndexExpression extends BaseExpression
{
    private Expression operand;
    private Expression index;
    
    public IndexExpression()
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
    
    public void setIndex(Expression index)
    {
        this.index = index;
    }
    
    public Expression getIndex()
    {
        return index;
    }

    @SuppressWarnings("unchecked")
    public Object evaluate(EvalContext ctx) throws EvalException
    {
        Object op = operand.evaluate(ctx);
        Object idx = index.evaluate(ctx);
        
        if (op == null) {
            throw new EvalException("The operand is null.");
        }
        
        if (op == null || !isNumber(idx)) {
            throw new EvalException("The index is null or is not a number.");
        }
        
        if (isArray(op)) {
            return Array.get(op, convertToInteger((Number)idx));
        } else if (isList(op)) {
            return ((List)op).get(convertToInteger((Number)idx));
        } else if (isString(op)) {
            return Character.toString(((String)op).charAt(convertToInteger((Number)idx)));
        } else {
            throw new EvalException(
                    "Index oprator can't be applied to " +
                    op.getClass().getCanonicalName());
        }
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        throw new EvalException("Operator \"[]\"is not supported");
    }
}
