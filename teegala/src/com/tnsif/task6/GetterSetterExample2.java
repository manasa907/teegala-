package com.tnsif.task6;

class Employee {
    // Private variables
    private int id;
    private double salary;

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return this.id;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return this.salary;
    }
}

public class GetterSetterExample2 {
    public static void main(String[] args) {
        Employee e = new Employee();

        // Set values using setters
        e.setId(101);
        e.setSalary(50000.0);

        // Get values using getters
        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Salary: " + e.getSalary());
    }
}
