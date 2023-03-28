package SOLID.L.Employee.EmployeeV2;

public class PermanentEmployee extends EmployeeV2 implements IEmployeeBonus {

//    @Override
//    public boolean AccessToODC() {
//        System.out.println("PermanentEmployee Access to ODC allowed");
//        return true;
//    }

    @Override
    public int MinimumSalary() {
        return 50000;
    }

    @Override
    public double CalculateBonus() {
        double bonus = 0.5 * Salary;
        System.out.println("Permanent Emp. Bonus " + bonus);
        return bonus;
    }
}
