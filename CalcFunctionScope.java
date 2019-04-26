import java.util.*;

public class CalcFunctionScope extends Value implements CalcScope {
    List<CalculatorParser.ParamContext> parameters;
    Map<String, Object> symbols = new LinkedHashMap<String, Object>();
    List<CalculatorParser.StatContext> statements = new LinkedList<CalculatorParser.StatContext>();
    CalcScope parentScope;
    String scopeName = "function";

    public CalcFunctionScope(String name, CalcScope parentScope, List<CalculatorParser.ParamContext> parameters, List<CalculatorParser.StatContext> statements) {
        super(name);
        this.parentScope = parentScope;
        this.parameters = parameters;
        this.statements = statements;
    }

    public List<CalculatorParser.ParamContext> getParamList() {
        return parameters;
    }

    public List<CalculatorParser.StatContext> getStatementList() {
        return statements;
    }

    public Object resolve(String name) {
        Object s = symbols.get(name);
        if (s !=null) return s;
        // if not here, check any enclosing scope
        if (getParentScope() != null) {
            return getParentScope().resolve(name);
        }
        return null; // not found
    }

    public void define(String name, Object value) {
        symbols.put(name, value);
    }

    public CalcScope getParentScope() { return parentScope;}
    public String getScopeName() { return scopeName; }

    public String toString() { return "function"+super.toString()+":"+symbols.values(); }
}