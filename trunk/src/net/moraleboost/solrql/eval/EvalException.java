package net.moraleboost.solrql.eval;

import net.moraleboost.solrql.SolrqlException;

@SuppressWarnings("serial")
public class EvalException extends SolrqlException
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
