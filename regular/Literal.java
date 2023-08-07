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
    public String toString() {
        return String.valueOf(characterClass);
        //Integer V = new Integer(5); -> X
        //Inteber V = Integer.valueOf(5); -> O
    }


}
