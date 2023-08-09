package Top;

public interface Top {
    public default void accept(Visitor t){
        t.visit(this);
    }
}
