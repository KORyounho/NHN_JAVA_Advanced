package regular;

public final class Then extends BinaryOperation implements Expression{
    public Then(Expression left, Expression right){
        //super(left, "", right);
        super(left,"", right);
    }

    //@Override
//    protected String getOperator() {
//        return "";
//    }
}
