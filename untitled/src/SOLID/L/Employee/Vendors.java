package SOLID.L.Employee;

import SOLID.O.EmployeeV1.EmployeeV1;

import java.awt.dnd.InvalidDnDOperationException;

public class Vendors extends EmployeeV1 {
    @Override
    public double CalculateBonus() {
        throw new InvalidDnDOperationException();
    }
}
