//Object of any child class should be as-is substitutable in a variable of parent type, without requiring any code changes
//
//No Special treatment/ change required for any child class
//Objects of child class should behave the same way as the objects of base class

//Derived types must be completely substitutable for their base types

package SOLID.L.Solution;
public abstract class BirdsV3 {

    public abstract void Eat();

    public abstract void MakeSound();
}
