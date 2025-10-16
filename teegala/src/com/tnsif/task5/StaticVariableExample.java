package com.tnsif.task5;

public class StaticVariableExample {

    // Static variable
    static int count = 0;

    // Constructor increments count
    StaticVariableExample() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        // Access static variable without creating object
        System.out.println("Total objects created: " + StaticVariableExample.count);
    }
}
