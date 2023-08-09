package Top;

public class Left implements Top {

    public void accept(Visitor t){
        t.visit(this);
    }
}
