package SOLID.L.Solution;

public class Sparrow extends FlyingBirds {
    @Override
    public void Fly() {
        System.out.println("Sparrow flies");
    }

    @Override
    public void Eat() {
        System.out.println("Sparrow eats");
    }

    @Override
    public void MakeSound() {System.out.println("Sparrow makes sound"); }
}
