public interface CalcScope {
    public String getScopeName();

    // /** Where to look next for symbols */
    public CalcScope getParentScope();

    /** Define a symbol in the current scope */
    public void define(String name, Object value);

    /** Look up name in this scope or in enclosing scope if not here */
    public Object resolve(String name);
}