package com.tnsif.task5;

public class OverloadSequence {

    // Method with (int, String)
    void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    // Overloaded method with (String, int)
    void show(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }

    public static void main(String[] args) {
        OverloadSequence obj = new OverloadSequence();
        obj.show(10, "Hello");   // calls method with (int, String)
        obj.show("World", 25);   // calls method with (String, int)
    }
}
