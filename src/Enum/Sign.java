package Enum;

public enum Sign {
   ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    public final String key;

     Sign(final String key){
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

}
