package net.moraleboost.flux.eval;

public interface Statement
{
    public Object execute(EvalContext ctx) throws EvalException;
}
