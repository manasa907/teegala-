package com.tnsif.task5;


public class Static {

    // Static variable
    static int count;

    // Static block (executed once when the class is loaded)
    static {
        count = 100; // initializing static variable
        System.out.println("Static block executed!");
        System.out.println("Initial Count = " + count);
    }

    // Constructor
    public Static() {
        count++;
        System.out.println("Constructor called. Count = " + count);
    }

    // Static method
    public static void displayCount() {
        System.out.println("Current Count (from static method) = " + count);
    }

    public static void main(String[] args) {
        // Calling static method directly
        Static.displayCount();

        // Creating objects
        Static obj1 = new Static();
        Static obj2 = new Static();

        // Accessing static variable
        System.out.println("Final Count (from main) = " + Static.count);

        // Again using static method
        Static.displayCount();
    }
}
