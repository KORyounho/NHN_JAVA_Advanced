package usecases;

import regular.*;

public final class Literals implements regular.Visitor{
    //String e = "abc" + "def"; 스트링 오브젝트가 몇개 만들어질까? new String("abc") , new String("def") 두개를 복사한 new String("abc"+"def")
    //가 나오기에 3개의 StringObject가 생성됨 -> 문자를 지우기가 어려워짐.
    //StringBuffer = Character의  Array -> char[] strbuf = new char[]; 임계영역을 지나기 이전의 race condition때문에, 하나하나 옮기기에는 어려움이 있음.
    //StringBuilder
    StringBuilder literals = new StringBuilder();
    @Override
    public void visit(Epsilon e) {
    }

    @Override
    public void visit(Literal e) {
        literals.append(e.getCharacterClass());
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Star e) {
        e.getExpression().accept(this);
    }

    public static String of(Expression e){
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiterals();
    }

    private String getLiterals() {
        return this.literals.toString();
    }
}
