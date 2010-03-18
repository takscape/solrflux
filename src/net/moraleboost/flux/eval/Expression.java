package net.moraleboost.flux.eval;

public interface Expression
{
    public Object evaluate(EvalContext ctx) throws EvalException;
    public String toSolrQuery(EvalContext ctx) throws EvalException;
}
