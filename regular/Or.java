package regular;

public final class Or extends BinaryOperation implements Expression{
      //이렇게 하는것도 있지만, 이런방식으로도 가능 BinaryOperation에
                                                // implements를 없애고, BinaryOperation implement Expression을 상속 받을 클래스에 사용
    BinaryOperation binaryOperation;
    public Or(Expression left, Expression right){
        //super(left, "/", right);
        super(left, right);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String literals() {
        return this.getLeft().literals() + this.getRight().literals();
    }

}
