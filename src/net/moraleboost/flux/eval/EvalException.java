package net.moraleboost.flux.eval;

import net.moraleboost.flux.FluxException;

@SuppressWarnings("serial")
public class EvalException extends FluxException
{
    public EvalException()
    {
        super();
    }
    
    public EvalException(String msg)
    {
        super(msg);
    }
    
    public EvalException(Throwable t)
    {
        super(t);
    }
    
    public EvalException(String msg, Throwable t)
    {
        super(msg, t);
    }
}
