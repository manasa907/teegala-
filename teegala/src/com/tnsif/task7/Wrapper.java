package com.tnsif.task7;

public class Wrapper {


	    public static void main(String[] args) {

	        // ----------- AUTOBOXING EXAMPLES -----------
	        // Example 1: int → Integer
	        int a = 10;
	        Integer obj1 = a; // autoboxing
	        System.out.println("Autoboxing Example 1: int to Integer -> " + obj1);

	        // Example 2: char → Character
	        char ch = 'X';
	        Character obj2 = ch; // autoboxing
	        System.out.println("Autoboxing Example 2: char to Character -> " + obj2);

	        // Example 3: double → Double
	        double d = 25.75;
	        Double obj3 = d; // autoboxing
	        System.out.println("Autoboxing Example 3: double to Double -> " + obj3);

	        System.out.println("---------------------------------------");

	        // ----------- UNBOXING EXAMPLES -----------
	        // Example 1: Integer → int
	        Integer numObj = 100;
	        int num = numObj; // unboxing
	        System.out.println("Unboxing Example 1: Integer to int -> " + num);

	        // Example 2: Character → char
	        Character charObj = 'Z';
	        char c = charObj; // unboxing
	        System.out.println("Unboxing Example 2: Character to char -> " + c);

	        // Example 3: Double → double
	        Double dblObj = 99.99;
	        double dbl = dblObj; // unboxing
	        System.out.println("Unboxing Example 3: Double to double -> " + dbl);
	    }
	}

