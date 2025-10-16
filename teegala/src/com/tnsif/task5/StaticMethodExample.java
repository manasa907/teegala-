package com.tnsif.task5;

public class StaticMethodExample {

    // Static method
    static void greet() {
        System.out.println("Hello! This is a static method.");
    }

    public static void main(String[] args) {
        // Call static method without creating object
        StaticMethodExample.greet();
    }
}
