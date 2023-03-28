package SOLID.L.Employee;

import SOLID.O.EmployeeV1.EmployeeV1;

public class Client {
    public static void main(String[] args) {
        EmployeeV1 vendors = new Vendors();
        vendors.Salary = 10000;
        vendors.CalculateBonus();
    }
}
