package com.tnsif.task5;

public class MethodOverLoad {

    // Method with one int parameter
    public void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    // Method with one double parameter (different type)
    public void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    // Method with two parameters: int first, then String
    public void display(int a, String b) {
        System.out.println("Method with int and String: " + a + ", " + b);
    }

    // Method with two parameters: String first, then int (different sequence)
    public void display(String b, int a) {
        System.out.println("Method with String and int: " + b + ", " + a);
    }

    public static void main(String[] args) {
        MethodOverLoad obj = new MethodOverLoad();

        obj.display(10);               // calls int version
        obj.display(12.5);             // calls double version
        obj.display(100, "Hello");     // calls int, String version
        obj.display("World", 200);     // calls String, int version
    }
}
