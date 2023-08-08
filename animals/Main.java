package animals;

import static animals.Typing.canYouFly;
import static animals.Typing.canYouSwiming;

public class Main {
    public static void main(String[] args) {
        canYouFly(new ChamBird());
        canYouFly(new ParkGee());
        canYouFly(new Penguin());

        canYouSwiming(new ChamBird());
        canYouSwiming(new ParkGee());
        canYouSwiming(new Penguin());
    }
}
