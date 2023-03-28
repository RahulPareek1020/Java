package SOLID.S.O.Employee;

import SOLID.S.O.Bird.Bird;
import SOLID.S.O.Employee.Employee;

public class Client {
    public static void main(String[] args) {
        Employee perEmp = new Employee("permanent");
        perEmp.Salary = 10000;
        perEmp.CalculateBonus();

        Employee contractEmp = new Employee("contractor");
        contractEmp.Salary = 10000;
        contractEmp.CalculateBonus();
    }
}
