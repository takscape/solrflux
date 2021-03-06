package net.moraleboost.flux.lang;

import net.moraleboost.flux.FluxException;

@SuppressWarnings("serial")
public class SyntaxException extends FluxException
{
    public SyntaxException()
    {
        super();
    }
    
    public SyntaxException(String msg)
    {
        super(msg);
    }
    
    public SyntaxException(Throwable t)
    {
        super(t);
    }
    
    public SyntaxException(String msg, Throwable t)
    {
        super(msg, t);
    }
}
