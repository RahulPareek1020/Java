package SOLID.L.Solution;

public class Penguine extends NonFlyingBirds {
    @Override
    public void Eat() {
        System.out.println("Penguine eats");
    }

    @Override
    public void MakeSound() {
        System.out.println("Penguine makes sound");
    }
}
