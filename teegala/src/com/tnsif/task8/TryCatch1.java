package com.tnsif.task8;

public class TryCatch1 {



	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30};

	        try {
	            // Accessing invalid index
	            System.out.println("Value at index 5: " + numbers[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e);
	        }

	        System.out.println("Program continues after handling exception...");
	    }
	}
