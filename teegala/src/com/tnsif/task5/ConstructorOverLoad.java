package com.tnsif.task5;

public class ConstructorOverLoad {

    private int id;
    private String name;
    private double salary;

    // Default constructor
    public ConstructorOverLoad() {
        System.out.println("Default constructor called");
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0.0;
    }

    // Constructor with one parameter
    public ConstructorOverLoad(int id) {
        System.out.println("Constructor with int parameter called");
        this.id = id;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Constructor with two parameters
    public ConstructorOverLoad(int id, String name) {
        System.out.println("Constructor with int and String parameters called");
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    // Constructor with three parameters
    public ConstructorOverLoad(int id, String name, double salary) {
        System.out.println("Constructor with int, String and double parameters called");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        ConstructorOverLoad obj1 = new ConstructorOverLoad();
        obj1.display();

        ConstructorOverLoad obj2 = new ConstructorOverLoad(101);
        obj2.display();

        ConstructorOverLoad obj3 = new ConstructorOverLoad(102, "Alice");
        obj3.display();

        ConstructorOverLoad obj4 = new ConstructorOverLoad(103, "Bob", 55000.50);
        obj4.display();
    }
}
