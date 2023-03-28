package SOLID.L.Employee.EmployeeV2;

public class Client {
    public static void main(String[] args) {
        IEmployee perEmp = new PermanentEmployee();
//        perEmp. = 10000;
//        perEmp. ();

        IEmployee contractEmp = new ContractEmployee();
//        contractEmp.Salary = 10000;
//        contractEmp.CalculateBonus();

        EmployeeV2 interEmp = new Interns();
        interEmp.Salary = 10000;
        //interEmp.CalculateBonus();
    }
}
