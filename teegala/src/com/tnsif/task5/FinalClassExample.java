package com.tnsif.task5;

// Final class
final class Vehicle {
    void show() {
        System.out.println("This is a final class. It cannot be inherited.");
    }
}

// Trying to extend Vehicle will give error
// class Car extends Vehicle { } // Error

public class FinalClassExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.show();
    }
}
