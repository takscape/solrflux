package net.moraleboost.flux;

@SuppressWarnings("serial")
public class FluxException extends Exception
{
    public FluxException()
    {
        super();
    }
    
    public FluxException(String msg)
    {
        super(msg);
    }
    
    public FluxException(Throwable t)
    {
        super(t);
    }
    
    public FluxException(String msg, Throwable t)
    {
        super(msg, t);
    }
}
