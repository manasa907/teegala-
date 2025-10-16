package com.tnsif.task10;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> animals = new HashSet<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Elephant");
        animals.add("Cat"); // duplicate ignored

        System.out.println("HashSet elements: " + animals);

        // Removing an element
        animals.remove("Horse");
        System.out.println("After removing Horse: " + animals);

        // Checking membership
        System.out.println("Contains Dog? " + animals.contains("Dog"));

        // Iterating through HashSet
        System.out.println("Iterating through HashSet:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}