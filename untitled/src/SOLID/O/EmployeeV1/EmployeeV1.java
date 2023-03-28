package SOLID.O.EmployeeV1;
//Employee
//Id, Name,
//Login
//CalculateBonus

public abstract class EmployeeV1 {
    public int id;
    public String name;
    public double Salary;

    public EmployeeV1() { }

  //  public abstract boolean AccessToODC();

    public abstract double CalculateBonus();
}
