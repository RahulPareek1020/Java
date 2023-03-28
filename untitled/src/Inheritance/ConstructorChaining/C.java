package Inheritance.ConstructorChaining;

public class C extends B{
    C(String Name, int age) {
        super("rahul" , 10);
        System.out.println("Constructor of C");
    }
}
