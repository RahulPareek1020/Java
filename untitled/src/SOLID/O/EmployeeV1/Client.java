package SOLID.O.EmployeeV1;

public class Client {
    public static void main(String[] args) {
        EmployeeV1 perEmp = new PermanentEmployee();
        perEmp.Salary = 10000;
        perEmp.CalculateBonus();

        EmployeeV1 contractEmp = new ContractEmployee();
        contractEmp.Salary = 10000;
        contractEmp.CalculateBonus();

        EmployeeV1 interEmp = new Interns();
        interEmp.Salary = 10000;
        interEmp.CalculateBonus();
    }
}
