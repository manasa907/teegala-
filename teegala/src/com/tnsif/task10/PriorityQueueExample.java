package com.tnsif.task10;
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements (automatically arranged in ascending order)
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue elements: " + pq);

        // Accessing the head of the queue
        System.out.println("Head element: " + pq.peek());

        // Removing elements
        pq.poll(); // removes head
        System.out.println("After polling: " + pq);

        // Iterating through PriorityQueue
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
