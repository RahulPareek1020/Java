package SOLID.L.Employee.EmployeeV2;
//Employee
//Id, Name,
//Login
//CalculateBonus

public class EmployeeV2 implements IEmployee {
    public int id;
    public String name;
    public double Salary;

    public EmployeeV2() { }

    @Override
    public int MinimumSalary() {
        return 50000;
    }
}
