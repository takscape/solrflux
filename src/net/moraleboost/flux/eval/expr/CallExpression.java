package net.moraleboost.flux.eval.expr;

import java.util.ArrayList;
import java.util.List;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;
import net.moraleboost.flux.eval.Expression;
import net.moraleboost.flux.eval.expr.func.Function;

public class CallExpression extends BaseExpression
{
    public Expression function;
    public List<Expression> arguments;
    
    public CallExpression()
    {
        super();
    }
    
    public void setFunction(Expression function)
    {
        this.function = function;
    }
    
    public Expression getFunction()
    {
        return function;
    }
    
    public void setArguments(List<Expression> arguments)
    {
        this.arguments = arguments;
    }
    
    public List<Expression> getArguments()
    {
        return arguments;
    }
    
    public void addArgument(Expression expr)
    {
        if (arguments == null) {
            arguments = new ArrayList<Expression>();
        }
        arguments.add(expr);
    }

    public Object evaluate(EvalContext ctx) throws EvalException
    {
        Object func = function.evaluate(ctx);
        
        if (func == null || !isFunction(func)) {
            throw new EvalException("No such function.");
        }
        
        List<Object> args = new ArrayList<Object>();
        if (arguments != null) {
            for (Expression expr: arguments) {
                args.add(expr.evaluate(ctx));
            }
        }
        
        try {
            ctx.enterFunction();
            return ((Function)func).call(args, ctx);
        } finally {
            ctx.leave();
        }
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        throw new EvalException("Function call is not supported in WHERE clauses.");
    }
}
