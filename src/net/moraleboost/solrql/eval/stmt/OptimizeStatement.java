package net.moraleboost.solrql.eval.stmt;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;

import net.moraleboost.solrql.eval.EvalContext;
import net.moraleboost.solrql.eval.EvalException;

public class OptimizeStatement extends BaseStatement
{
    private String destination;

    public OptimizeStatement()
    {
        super();
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    public String getDestination()
    {
        return destination;
    }

    public Object execute(EvalContext ctx) throws EvalException
    {
        SolrServer server = getSolrServer(destination, ctx);
        try {
            return server.optimize();
        } catch (IOException e) {
            throw new EvalException(e);
        } catch (SolrServerException e) {
            throw new EvalException(e);
        }
    }
}
