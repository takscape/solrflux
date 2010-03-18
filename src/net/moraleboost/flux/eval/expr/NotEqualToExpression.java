package net.moraleboost.flux.eval.expr;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;
import net.moraleboost.flux.eval.Expression;
import net.moraleboost.flux.eval.expr.arith.NotEqualTo;

public class NotEqualToExpression extends BinaryOperatorExpression
{
    public static enum Type
    {
        Single, Double
    }
    
    private Type type;
    
    public NotEqualToExpression(Type type)
    {
        super();
        this.type = type;
    }
    
    public Type getType()
    {
        return type;
    }

    @Override
    protected Object evaluateInner(Object lho, Object rho, EvalContext ctx)
    throws EvalException
    {
        if (isNumber(lho) && isNumber(rho)) {
            // number
            return evaluateArithmeticCalculation(
                    (Number)lho, (Number)rho, ctx, NotEqualTo.INSTANCE);
        } else {
            return !lho.equals(rho);
        }
    }

    public String toSolrQuery(EvalContext ctx) throws EvalException
    {
        // 許されるパターン
        // 1. id != IdLiteral以外のLiteralExpression
        // 2. IdLiteral以外のLiteralExpression != id
        Expression lho = getLeftHandOperand();
        Expression rho = getRightHandOperand();
        
        if (isIdLiteral(lho)) {
            // id!=value, id!=NULL, or id!=*
            if (isLiteralExpressionExcludingId(rho)) {
                return getFieldQuery((IdLiteral)lho, (LiteralExpression)rho, ctx);
            }
        } else if (rho instanceof IdLiteral) {
            // value!=id, NULL!=id, or *!=id
            if (isLiteralExpressionExcludingId(lho)) {
                return getFieldQuery((IdLiteral)rho, (LiteralExpression)lho, ctx);
            }
        }
        
        throw new EvalException(
                "Specified expression is not supported in WHERE clauses.");
    }
    
    private String getFieldQuery(IdLiteral field, LiteralExpression value, EvalContext ctx)
    throws EvalException
    {
        if (isStringLiteral(value)) {
            String rho = value.toSolrQuery(ctx);
            
            if (rho.equals("")) {
                // id!="", id!==""
                // id:[* TO *] に変換
                return field.toSolrQuery(ctx) + ":[* TO *]";
            }
            
            if (type == Type.Single) {
                // term query
                // *:* NOT id=value に変換
                return "*:* NOT " + field.toSolrQuery(ctx) + ":" + rho;
            } else {
                // phrase query
                // *:* NOT id="value"に変換
                return "*:* NOT " + field.toSolrQuery(ctx) + ":\"" + rho + "\"";
            }
        } else if (isNullLiteral(value)) {
            // id!=NULL or id!==NULL
            // id:[* TO *] に変換
            return field.toSolrQuery(ctx) + ":[* TO *]";
        } else {
            // id=value
            // *:* NOT id=value に変換
            return "*:* NOT " + field.toSolrQuery(ctx) + ":" + value.toSolrQuery(ctx);
        }
    }
}
