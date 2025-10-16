package com.tnsif.task10;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Adding elements at first and last positions
        numbers.addFirst(5);
        numbers.addLast(50);

        System.out.println("LinkedList elements: " + numbers);

        // Removing elements
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last: " + numbers);

        // Accessing element
        System.out.println("Element at index 1: " + numbers.get(1));

        // Iterating using iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}