package Inheritance;

public class client {
    public static void main(String[] args) {
        Father f = new Father();
        f.Name = "Dinesh";
        f.address = "Kota";
        f.hasCar = true;
        //f.hasHome = true;
        f.canDriveCar = true;

        Son s1 = new Son();
        s1.Name = "rahul";
        s1.hasCar = true;
        s1.canDriveCar = true;
        s1.hasBike = true;
        s1.canDriveBike = true;
        s1.address = "Bangalore";

        //With child class reference (s2) we can't create base class object, if we need to do it we need to cast base class obj to child class
        //Son s2 = new Father();
        Son s2 = (Son) new Father(); // casting
        s2.Name = "Amit";
        s2.hasCar = true;
        s2.canDriveCar = true;
        s2.hasBike = true;
        s2.canDriveBike = true;

        //With base class reference (s3) we can create child class object but using base class obj we can't access child class attributes
        Father s3 = new Son();
        s3.hasCar = true;
        s3.canDriveCar = true;
        //s3.hasBike = true;
        //s3.canDriveBike = true;
    }
}
