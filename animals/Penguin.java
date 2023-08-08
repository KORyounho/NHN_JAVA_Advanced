package animals;

public class Penguin extends Sae{

    public Penguin(){}

    @Override
    public boolean canYouFly() {
        return false;
    }

    @Override
    public boolean canYouSwiming() {
        return true;
    }
}
