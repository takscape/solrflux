package net.moraleboost.flux.eval.stmt;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;

import net.moraleboost.flux.eval.EvalContext;
import net.moraleboost.flux.eval.EvalException;

public class CommitStatement extends BaseStatement
{
    private String destination;
    
    public CommitStatement()
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

    public UpdateResponse execute(EvalContext ctx) throws EvalException
    {
        SolrServer server = getSolrServer(destination, ctx);
        try {
            return server.commit();
        } catch (IOException e) {
            throw new EvalException(e);
        } catch (SolrServerException e) {
            throw new EvalException(e);
        }
    }
}
