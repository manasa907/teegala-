package com.tnsif.task3;
import com.tnsif.task3.employees.Manager;
import com.tnsif.task3.employees.Developer;
import com.tnsif.task3.utilities.EmployeeUtilities;

/**
 * The AssignmentMain class demonstrates the usage of Employee, Manager, Developer,
 * and EmployeeUtilities classes with proper access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("John Doe", 101, 75000.0, "IT");
        Developer developer = new Developer("Jane Smith", 102, 65000.0, "Java");

        // Create utility object
        EmployeeUtilities utils = new EmployeeUtilities();

        // Display initial details
        System.out.println("Initial Manager Details:");
        utils.displayEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
        System.out.println("\nInitial Developer Details:");
        utils.displayEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Increase salaries
        utils.increaseSalary(manager, 10.0); // 10% increase
        utils.increaseSalary(developer, 15.0); // 15% increase

        // Display updated details
        System.out.println("\nUpdated Manager Details:");
        utils.displayEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
        System.out.println("\nUpdated Developer Details:");
        utils.displayEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}