package animals;

public interface Animal {

    public default String type(){
        return this.getClass().getSimpleName();
    }

    public boolean canYouFly();
    public boolean canYouSwiming();
}
