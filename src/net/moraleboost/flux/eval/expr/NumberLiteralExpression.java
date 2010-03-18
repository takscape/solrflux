package net.moraleboost.flux.eval.expr;

public abstract class NumberLiteralExpression extends LiteralExpression
{
    public NumberLiteralExpression()
    {
        super();
    }
    
    public abstract boolean isNegativeValue();
}
