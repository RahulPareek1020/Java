package SOLID.S.O.Bird;

public class Client {
    public static void main(String[] args) {
        Bird sparrow = new Bird("sparrow");
        sparrow.Eat();
        sparrow.Fly();

        Bird pigeon = new Bird("pigeon");
        pigeon.Eat();
        pigeon.Fly();
    }
}
