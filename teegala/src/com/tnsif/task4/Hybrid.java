package com.tnsif.task4;

// Base class
class Person {
    void showPerson() {
        System.out.println("This is a person");
    }
}

// Derived class from Person
class Employee extends Person {
    void showEmployee() {
        System.out.println("This person is an employee");
    }
}

// Another base (interface) to show multiple inheritance concept
interface Sports {
    void play();
}

// Derived class from Person and implements Sports (Hybrid)
class Student extends Person implements Sports {
    void showStudent() {
        System.out.println("This person is a student");
    }

    public void play() {
        System.out.println("Student plays football");
    }
}

// Another class that extends Student
class CollegeStudent extends Student {
    void showCollegeStudent() {
        System.out.println("This student studies in college");
    }
}

// Main class
public class Hybrid {
    public static void main(String[] args) {

        CollegeStudent cs = new CollegeStudent();
        cs.showPerson();         // From Person
        cs.showStudent();        // From Student
        cs.showCollegeStudent(); // From CollegeStudent
        cs.play();               // From Sports interface

        System.out.println("-----------------------------");

        Employee e = new Employee();
        e.showPerson();          // From Person
        e.showEmployee();        // From Employee
    }
}
