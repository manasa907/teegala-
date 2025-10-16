package com.tnsif.task3.utilities;


import com.tnsif.task3.employees.Employee;

/**
 * The EmployeeUtilities class provides methods to perform operations on Employee objects.
 * This class demonstrates the use of access modifiers by accessing Employee attributes
 * through public methods.
 */
public class EmployeeUtilities {
    /**
     * Increases the salary of an employee by a given percentage.
     * @param employee The employee whose salary is to be increased.
     * @param percentage The percentage increase (e.g., 10 for 10%).
     */
    public void increaseSalary(Employee employee, double percentage) {
        double currentSalary = employee.getSalary();
        double increase = currentSalary * (percentage / 100);
        employee.setSalary(currentSalary + increase);
    }

    /**
     * Displays the details of an employee.
     * @param employee The employee whose details are to be displayed.
     */
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: $" + employee.getSalary());
    }
}