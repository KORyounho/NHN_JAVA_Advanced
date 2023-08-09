package regular;

public final class Literal implements Expression{
    private char characterClass;

    public char getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(char characterClass) {
        this.characterClass = characterClass;
    }

    public Literal(char characterClass){
        this.characterClass = characterClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public final String literals() {
        return String.valueOf(this.getCharacterClass()); // toString()은 사용하면 안됨, toString이 결과를 다르게 할 필요 없음.
    }

    @Override
    public String toString() {
        return String.valueOf(this.getCharacterClass());
        //Integer V = new Integer(5); -> X
        //Inteber V = Integer.valueOf(5); -> O
    }


}
