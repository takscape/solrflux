package net.moraleboost.solrql.eval.expr;

public abstract class NumberLiteralExpression extends LiteralExpression
{
    public NumberLiteralExpression()
    {
        super();
    }
    
    public abstract boolean isNegativeValue();
}
