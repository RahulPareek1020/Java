package SOLID.S.O.Employee;
//Employee
//Id, Name,
//Login
//CalculateBonus

public class Employee {
    public int id;
    public String name;
    double Salary;
    String empType;

    public Employee(String empType) {
        this.empType = empType;
    }

    public double CalculateBonus() {
        double bonus = 0;

        if(this.empType == "permanent") {
            bonus = Salary * 0.5;
        }
        else if(this.empType == "contractor") {
            bonus = Salary * 0.2;
        }
        //future employee type Interns

        System.out.println("employee type " +  this.empType + " bonus " + bonus);

        return bonus;
    }

}
