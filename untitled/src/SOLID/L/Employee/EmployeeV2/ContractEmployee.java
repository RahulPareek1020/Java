package SOLID.L.Employee.EmployeeV2;

public class ContractEmployee extends EmployeeV2 implements IEmployeeBonus {
    String parentCompany;

    public ContractEmployee() {

    }

//    @Override
//    public boolean AccessToODC() {
//        System.out.println("ContractEmployee Access to ODC allowed");
//        return true;
//    }

    @Override
    public double CalculateBonus() {
        double bonus = 0.2 * Salary;
        System.out.println("Contract Emp. Bonus " + bonus);
        return bonus;
    }
}
