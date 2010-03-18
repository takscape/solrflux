package net.moraleboost.flux.eval;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import net.moraleboost.flux.eval.expr.func.BigDecimalFunction;
import net.moraleboost.flux.eval.expr.func.BigIntegerFunction;
import net.moraleboost.flux.eval.expr.func.DateFunction;
import net.moraleboost.flux.eval.expr.func.DoubleFunction;
import net.moraleboost.flux.eval.expr.func.FloatFunction;
import net.moraleboost.flux.eval.expr.func.IntegerFunction;
import net.moraleboost.flux.eval.expr.func.LengthFunction;
import net.moraleboost.flux.eval.expr.func.LongFunction;
import net.moraleboost.flux.eval.expr.func.StringFunction;
import net.moraleboost.flux.eval.expr.func.SubstringFunction;

import org.apache.solr.client.solrj.SolrServer;

public class EvalContext
{
    private SolrServer defaultServer;
    private Namespace globalNamespace;
    private Namespace namespace;
    private Stack<Namespace> callStack;
    
    public EvalContext()
    {
        Map<String, Object> defaults = new HashMap<String, Object>();
        registerDefaults(defaults);
        
        globalNamespace = new Namespace(defaults);
        namespace = globalNamespace;
        callStack = new Stack<Namespace>();
    }
    
    private void registerDefaults(Map<String, Object> defaults)
    {
        defaults.put("INTEGER", new IntegerFunction());
        defaults.put("LONG", new LongFunction());
        defaults.put("BIGINTEGER", new BigIntegerFunction());
        defaults.put("FLOAT", new FloatFunction());
        defaults.put("DOUBLE", new DoubleFunction());
        defaults.put("BIGDECIMAL", new BigDecimalFunction());
        defaults.put("STRING", new StringFunction());
        defaults.put("DATE", new DateFunction());
        defaults.put("LENGTH", new LengthFunction());
        defaults.put("SUBSTRING", new SubstringFunction());
    }
    
    public SolrServer getDefaultServer()
    {
        return defaultServer;
    }
    
    public void setDefaultServer(SolrServer server)
    {
        this.defaultServer = server;
    }
    
    public Namespace getNamespace()
    {
        return namespace;
    }
    
    public void clear()
    {
        namespace.clear();
    }
    
    public void clearGlobal()
    {
        globalNamespace.clear();
    }
    
    public Object put(String name, Object value)
    {
        return namespace.put(name, value);
    }
    
    public Object get(String name)
    {
        return namespace.get(name);
    }
    
    public Object putGlobal(String name, Object value)
    {
        return globalNamespace.put(name, value);
    }
    
    public Object getGlobal(String name)
    {
        return globalNamespace.get(name);
    }
    
    public void enterBlock()
    {
        // 現在のネームスペースを引き継いで、新しいネームスペースを作成する。
        callStack.push(namespace);
        namespace = new Namespace(namespace);
    }
    
    public void enterFunction()
    {
        // グローバルネームスペースを引き継いで、新しいネームスペースを作成する。
        callStack.push(namespace);
        namespace = new Namespace(globalNamespace);
    }
    
    public void leave()
    throws EvalException
    {
        if (callStack.size() <= 0) {
            throw new EvalException("Call stack is empty.");
        } else {
            namespace = callStack.pop();
        }
    }
}
