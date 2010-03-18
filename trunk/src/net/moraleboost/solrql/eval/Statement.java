package net.moraleboost.solrql.eval;

public interface Statement
{
    public Object execute(EvalContext ctx) throws EvalException;
}
