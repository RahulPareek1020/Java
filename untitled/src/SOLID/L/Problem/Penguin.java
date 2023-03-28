package SOLID.L.Problem;

import SOLID.O.BirdV2;

public class Penguin extends BirdV2 {
    //Penguin does not fly
    @Override
    public void Fly() {
        //System.out.println("Sparrow flies");
        //Leave this method empty or throw exception
    }

    @Override
    public void Eat() {
        System.out.println("Penguin eats");
    }

    @Override
    public void MakeSound() {
        System.out.println("Penguin makes sound");
    }
}
