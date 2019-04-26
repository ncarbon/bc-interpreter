public class CalcLocalScope extends CalcBaseScope {
    public CalcLocalScope(CalcScope parent) { super(parent); }
    public String getScopeName() { return "locals"; }
    public CalcScope getParentScope() { return parentScope; }
}