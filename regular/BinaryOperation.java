package regular;

protected abstract class BinaryOperation implements Expression{ // Impl, DefaultImple, Base등을 이용해서 코드만 저장하는 용도를 알림.
    private Expression left;
    private Expression right;
    private String operator;
    //protected BinaryOperation(Expression left, String operator, Expression right){   //내부에서만 BinaryOperation을 사용할것이기에, protected로 선언
    protected BinaryOperation(Expression left, Expression right){ //super을 제외하고는 불러올 수 없음.
        this.left = left;
        this.right = right;
        //this.operator = operator;
    }
    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    protected abstract String getOperator();

    @Override
    public String toString() {
        return "(" + this.getLeft().toString() + getOperator().toString() + this.getRight() + ")";
    }
}
