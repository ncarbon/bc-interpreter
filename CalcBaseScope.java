import java.util.LinkedHashMap;
import java.util.Map;

public abstract class CalcBaseScope implements CalcScope {
    public static int count = 0;
    CalcScope parentScope; // null if global (outermost) scope
    Map<String, Object> symbols = new LinkedHashMap<String, Object>();

    public CalcBaseScope(CalcScope parentScope) { count++; System.out.println("Scope " + count +  " created"); this.parentScope = parentScope;  }

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

    public CalcScope getParentScope() { return parentScope; }

    public String toString() { return getScopeName()+":"+symbols.keySet().toString(); }
}