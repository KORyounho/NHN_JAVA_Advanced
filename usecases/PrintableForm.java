package usecases;

import regular.*;

public class PrintableForm implements regular.Visitor{
    private static StringBuilder printableFormBuilder = new StringBuilder();

    public static String of(Expression e){
        PrintableForm printableForm = new PrintableForm();
        e.accept(printableForm);

        return printableForm.getPrintableForm();
    }

    private String getLiterals() {
        return this.printableFormBuilder.toString();
    }

    @Override
    public void visit(Epsilon e) {
        printableFormBuilder.append("\u03B5");
    }

    @Override
    public void visit(Literal e) {
        printableFormBuilder.append(String.valueOf(e.getCharacterClass()));
    }

    @Override
    public void visit(Then e) {
        printableFormBuilder.append("(");
        e.getLeft().accept(this);
        printableFormBuilder.append("");
        e.getRight().accept(this);
        printableFormBuilder.append(")");
    }

    @Override
    public void visit(Or e) {
        printableFormBuilder.append("(");
        e.getLeft().accept(this);
        printableFormBuilder.append('|');
        e.getRight().accept(this);
        printableFormBuilder.append(")");
    }

    @Override
    public void visit(Star e) {
        printableFormBuilder.append("(");
        e.getExpression().accept(this);
        printableFormBuilder.append(")*");
    }

    public String getPrintableForm(){
        return printableFormBuilder.toString();
    }

}
