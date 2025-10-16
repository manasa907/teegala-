package com.tnsif.task3.employees;



/**
 * The Employee class represents a basic employee with common attributes.
 * This class uses private access modifiers for its attributes and provides
 * public getter and setter methods for access and modification.
 */
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    /**
     * Default constructor for Employee.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor for Employee.
     * @param name The name of the employee.
     * @param employeeId The unique ID of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    /**
     * Gets the name of the employee.
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee ID.
     * @return The employee ID.
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID.
     * @param employeeId The employee ID to set.
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the salary of the employee.
     * @return The salary of the employee.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * @param salary The salary to set.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}