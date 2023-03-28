package Inheritance.ConstructorChaining;

import Inheritance.Father;
import Inheritance.Son;

public class B extends A{
    B (){
        System.out.println("Constructor of B");
    }

    B(String Name, int age) {
        super(age);
        System.out.println("Constructor of B " + Name);
    }
}
