package com.tnsif.task5;

public class StaticBlockExample {

    // Static block
    static {
        System.out.println("This is a static block. It executes before main.");
    }

    public static void main(String[] args) {
        System.out.println("This is the main method.");
    }
}
