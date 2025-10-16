package com.tnsif.task3.employees;


/**
 * The Manager class is a subclass of Employee with an additional attribute
 * for the department managed.
 */
public class Manager extends Employee {
    private String department;

    /**
     * Default constructor for Manager.
     */
    public Manager() {
    }

    /**
     * Parameterized constructor for Manager.
     * @param name The name of the manager.
     * @param employeeId The unique ID of the manager.
     * @param salary The salary of the manager.
     * @param department The department managed by the manager.
     */
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    /**
     * Gets the department managed by the manager.
     * @return The department.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department managed by the manager.
     * @param department The department to set.
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}