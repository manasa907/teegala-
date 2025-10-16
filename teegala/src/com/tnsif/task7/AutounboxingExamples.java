package com.tnsif.task7;
//File: AutoUnboxingExamples.java
import java.util.ArrayList;

public class AutounboxingExamples {
 public static void main(String[] args) {
     example1();
     example2();
     example3();
 }

 // Example 1: Assigning wrapper to primitive
 static void example1() {
     Integer numObj = Integer.valueOf(200);
     int numPrimitive = numObj; // Auto-unboxing
     System.out.println("Auto-unboxed int (example1): " + numPrimitive);
 }

 // Example 2: Access from collections
 static void example2() {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(7); // Autoboxing
     int value = list.get(0); // Auto-unboxing
     System.out.println("Auto-unboxed value from ArrayList (example2): " + value);
 }

 // Example 3: Character to primitive char
 static void example3() {
     Character charObj = 'A';
     char c = charObj; // Auto-unboxing
     System.out.println("Auto-unboxed char (example3): " + c);
 }
}

