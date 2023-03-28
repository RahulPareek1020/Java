package SOLID.O;

public class Crow extends BirdV2{
    @Override
    public void Fly() {
        System.out.println("Crow flies");
    }
    @Override
    public  void Eat() {
        System.out.println("Crow eats");
    }

    @Override
    public void MakeSound() {
        System.out.println("Crow makes sound");
    }
}
