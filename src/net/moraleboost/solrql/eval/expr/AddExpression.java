package net.moraleboost.solrql.eval.expr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;
import net.moraleboost.solrql.eval.expr.arith.Add;

public class AddExpression extends BinaryOperatorExpression
{
    public AddExpression()
    {
        super();
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Object evaluateInner(Object lho, Object rho, EvalContext ctx)
    throws EvalException
    {
        if (isNumber(lho) && isNumber(rho)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number)lho, (Number)rho, ctx, Add.INSTANCE);
        } else if (isString(lho) && isString(rho)) {
            // concatenate
            return ((String)lho + (String)rho);
        } else if (isList(lho)) {
            // concatenate
            List ret = new ArrayList((List)lho);
            addToList(ret, rho);
            return ret;
        } else if (isArray(lho)) {
            // concatenate
            List ret = new ArrayList();
            for (int i=0; i<Array.getLength(lho); ++i) {
                ret.add(Array.get(lho, i));
            }
            addToList(ret, rho);
            // returned as Object[]
            return ret.toArray();
        }
        
        throw new EvalException("Operands have incompatible types.");
    }
    
    @SuppressWarnings("unchecked")
    private void addToList(List list, Object obj)
    {
        if (isList(obj)) {
            // append all elements
            list.addAll((List)obj);
        } else if (isArray(obj)) {
            // append all elements
            int len = Array.getLength(obj);
            for (int i=0; i<len; ++i) {
                list.add(Array.get(obj, i));
            }
        } else {
            // append an element
            list.add(obj);
        }
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        throw new EvalException("Operator \"+\" is not supported in WHERE clauses.");
    }
}
