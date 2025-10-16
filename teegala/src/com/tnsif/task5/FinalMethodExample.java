package com.tnsif.task5;

// Parent class
class Parent {
    // Final method
    final void display() {
        System.out.println("Final method in Parent class. Cannot be overridden.");
    }
}

// Child class
class Child extends Parent {
    // Trying to override display() will cause error
    // void display() {
    //     System.out.println("Trying to override final method"); // Error
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();  // Calls final method from Parent
    }
}
