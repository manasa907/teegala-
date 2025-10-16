package com.tnsif.task10;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Banana"); // duplicates allowed

        // Displaying elements
        System.out.println("ArrayList elements: " + fruits);

        // Accessing element by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Modifying element
        fruits.set(1, "Blueberry");
        System.out.println("After modification: " + fruits);

        // Removing an element
        fruits.remove("Mango");
        System.out.println("After removing Mango: " + fruits);

        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}