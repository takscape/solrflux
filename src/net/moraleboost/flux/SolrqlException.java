package net.moraleboost.flux;

@SuppressWarnings("serial")
public class SolrqlException extends Exception
{
    public SolrqlException()
    {
        super();
    }
    
    public SolrqlException(String msg)
    {
        super(msg);
    }
    
    public SolrqlException(Throwable t)
    {
        super(t);
    }
    
    public SolrqlException(String msg, Throwable t)
    {
        super(msg, t);
    }
}
