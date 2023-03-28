package SOLID.O;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BirdV2 sparrow = new Sparrow();
        BirdV2 crow = new Crow();

        sparrow.Fly();
        sparrow.Eat();

        crow.Fly();
        crow.Eat();

        List<BirdV2> birds = new ArrayList<>();
        birds.add(sparrow);
        birds.add(crow);

        for (BirdV2 b : birds) {
            b.Fly();
            b.Eat();
        }
    }
}
