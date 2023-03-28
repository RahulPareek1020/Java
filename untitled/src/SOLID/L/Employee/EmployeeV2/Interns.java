package SOLID.L.Employee.EmployeeV2;

public class Interns extends EmployeeV2 implements IEmployeeBonus {
//    @Override
//    public boolean AccessToODC() {
//        System.out.println("Interns Access to ODC allowed");
//        return true;
//    }

    @Override
    public double CalculateBonus() {
        double bonus = 0.1 * Salary;
        System.out.println("Interns Emp. Bonus " + bonus);
        return bonus;
    }
}
