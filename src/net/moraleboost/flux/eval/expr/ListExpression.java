package net.moraleboost.flux.eval.expr;

import java.util.ArrayList;
import java.util.List;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;
import net.moraleboost.flux.eval.Expression;

public class ListExpression extends BaseExpression
{
    private List<Expression> elements;
    
    public ListExpression()
    {
        super();
    }
    
    public List<Expression> getElements()
    {
        return elements;
    }
    
    public void setElements(List<Expression> elements)
    {
        this.elements = elements;
    }
    
    public void addElement(Expression expr)
    {
        if (elements == null) {
            elements = new ArrayList<Expression>();
        }
        
        elements.add(expr);
    }

    public List<Object> evaluate(EvalContext ctx) throws EvalException
    {
        List<Object> ret = new ArrayList<Object>(elements.size());
        
        if (elements != null) {
            for (Expression expr: elements) {
                ret.add(expr.evaluate(ctx));
            }
        }
        
        return ret;
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        throw new EvalException("Lists are not supported in WHERE expressions.");
    }
}
