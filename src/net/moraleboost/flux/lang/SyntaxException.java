package net.moraleboost.flux.lang;

import net.moraleboost.flux.SolrqlException;

@SuppressWarnings("serial")
public class SyntaxException extends SolrqlException
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
