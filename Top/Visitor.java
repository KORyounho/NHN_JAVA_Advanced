package Top;

public interface Visitor {
    default void visit(Top top ){ throw new RuntimeException();}
    void visit(Left left);
    void visit(Right right);
}
