package SOLID.O.EmployeeV1;

public class PermanentEmployee extends EmployeeV1 {

//    @Override
//    public boolean AccessToODC() {
//        System.out.println("PermanentEmployee Access to ODC allowed");
//        return true;
//    }

    public double CalculateBonus() {
        double bonus = 0.5 * Salary;
        System.out.println("Permanent Emp. Bonus " + bonus);
        return bonus;
    }
}
