package com.tnsif.task6;


class Student {
    // Private variable
    private String name;

    // Setter method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get name
    public String getName() {
        return this.name;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Student s = new Student();

        // Set the name using setter
        s.setName("Nani");

        // Get the name using getter
        System.out.println("Student Name: " + s.getName());
    }
}
