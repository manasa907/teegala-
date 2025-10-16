package com.tnsif.task10;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack elements: " + stack);

        // Peek (top element)
        System.out.println("Top element: " + stack.peek());

        // Pop operation
        stack.pop();
        System.out.println("After pop: " + stack);

        // Searching element
        int pos = stack.search(20);
        System.out.println("Position of 20 (from top): " + pos);

        // Iterating through stack
        System.out.println("Iterating through stack:");
        for (Integer num : stack) {
            System.out.println(num);
        }
    }
}
