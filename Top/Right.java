package Top;

public class Right implements Top {

    public void accept(Visitor t){
        t.visit(this);
    }
}
