public class CalcGlobalScope extends CalcBaseScope {
    public CalcGlobalScope(CalcScope parentScope) { super(parentScope); }
    public String getScopeName() { return "globals"; }
    public CalcScope getParentScope() { return parentScope; }
}