package com.tnsif.task10;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> colors = new Vector<>();

        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Displaying elements
        System.out.println("Vector elements: " + colors);

        // Accessing element
        System.out.println("First color: " + colors.firstElement());
        System.out.println("Last color: " + colors.lastElement());

        // Removing element
        colors.remove("Blue");
        System.out.println("After removing Blue: " + colors);

        // Iterating using Enumeration
        System.out.println("Iterating using Enumeration:");
        Enumeration<String> e = colors.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}