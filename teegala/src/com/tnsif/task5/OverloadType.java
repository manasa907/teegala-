package com.tnsif.task5;

public class OverloadType {
	

	    // Method with int parameters
	    void display(int a, int b) {
	        System.out.println("Sum of integers: " + (a + b));
	    }

	    // Overloaded method with double parameters
	    void display(double a, double b) {
	        System.out.println("Sum of doubles: " + (a + b));
	    }

	    public static void main(String[] args) {
	        OverloadType obj = new OverloadType();
	        obj.display(10, 20);       // calls method with int parameters
	        obj.display(12.5, 7.5);    // calls method with double parameters
	    }
	}


