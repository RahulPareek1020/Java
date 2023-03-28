package SOLID.S.O.Bird.V1;

public class Crow extends BirdV1 {
    @Override
    void Fly() {
        System.out.println("Crow flies");
    }

    @Override
    void Eat() {
        System.out.println("Crow Eats");
    }
}
