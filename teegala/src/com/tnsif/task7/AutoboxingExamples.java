package com.tnsif.task7;
// File: AutoBoxingExamples.java
import java.util.ArrayList;

public class AutoboxingExamples {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    // Example 1: Assigning primitive to wrapper
    static void example1() {
        int x = 100;
        Integer obj = x; // Autoboxing
        System.out.println("Autoboxed Integer (example1): " + obj);
    }

    // Example 2: Using primitives in collections
    static void example2() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.5); // Autoboxing
        numbers.add(2.5); // Autoboxing
        System.out.println("Autoboxed Doubles in ArrayList (example2): " + numbers);
    }

    // Example 3: Assigning char to Character
    static void example3() {
        char ch = 'Z';
        Character chObj = ch; // Autoboxing
        System.out.println("Autoboxed Character (example3): " + chObj);
    }
}



