package com.tnsif.task10;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Adding elements (maintains insertion order)
        lhs.add("One");
        lhs.add("Two");
        lhs.add("Three");
        lhs.add("Four");

        System.out.println("LinkedHashSet elements: " + lhs);

        // Removing element
        lhs.remove("Two");
        System.out.println("After removing Two: " + lhs);

        // Checking if an element exists
        System.out.println("Contains Three? " + lhs.contains("Three"));

        // Iterating through LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (String item : lhs) {
            System.out.println(item);
        }
    }
}
