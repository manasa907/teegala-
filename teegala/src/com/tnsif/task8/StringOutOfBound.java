package com.tnsif.task8;

public class StringOutOfBound {

	
	    public static void main(String[] args) {
	        String str = "Hello";

	        try {
	            // Accessing index out of range
	            char ch = str.charAt(10); 
	            System.out.println("Character at index 10: " + ch);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e);
	        }

	        System.out.println("Program continues normally...");
	    }
	}

