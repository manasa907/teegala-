package com.tnsif.task3.employees;


/**
 * The Developer class is a subclass of Employee with an additional attribute
 * for the programming language expertise.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Default constructor for Developer.
     */
    public Developer() {
    }

    /**
     * Parameterized constructor for Developer.
     * @param name The name of the developer.
     * @param employeeId The unique ID of the developer.
     * @param salary The salary of the developer.
     * @param programmingLanguage The programming language expertise.
     */
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    /**
     * Gets the programming language expertise of the developer.
     * @return The programming language.
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Sets the programming language expertise of the developer.
     * @param programmingLanguage The programming language to set.
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}