public class Value {
    
    public static enum Type {INVALID, STRING, VOID, INTEGER, DOUBLE}
    private Object value;
    private Type type;

    public Value(Object object) {
        this.value = object;
        setType();
    }

    private void setType() {
        if(isDouble()) {
            type = Type.DOUBLE;
        } else if(isInteger()) {
            type = Type.INTEGER;
        } else if(isString()) {
            type = Type.STRING;
        } else {
            type = Type.INVALID;
        }
    }

    public boolean isDouble() {
        return value instanceof Double;
    }
    public Double asDouble() {
        if(isDouble()) {
            return (Double) value;
        }
        return asInteger() / 1.0;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public String asString() {
        return (String) value;
    }

    public void setValue(Value val) {
        this.value = val;
    }

    public void increment() {

        if(value instanceof Double) {
            Double incremented = ((Double)value ) + 1.0;
            value = (Object)incremented;
        } else {
            Integer incremented = ((Integer)value ) + 1;
            value = (Object)incremented;
        }
    }

    public void decrement() {

        if(value instanceof Double) {
            Double incremented = ((Double)value ) - 1.0;
            value = (Object)incremented;
        } else {
            Integer incremented = ((Integer)value ) - 1;
            value = (Object)incremented;
        }
    }

    public Type getType() {
        return type;
    }
}