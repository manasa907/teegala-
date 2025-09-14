package com.tnsif.task1;

public class Operators {

	public static void main(String[] args) {

	        int a = 10, b = 5, c;

	        // 1. Arithmetic
	        System.out.println("Arithmetic: " + (a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b) + " " + (a%b));

	        // 2. Relational
	        System.out.println("Relational: " + (a>b) + " " + (a<b) + " " + (a==b) + " " + (a!=b));

	        // 3. Logical
	        boolean x = true, y = false;
	        System.out.println("Logical: " + (x&&y) + " " + (x||y) + " " + (!x));

	        // 4. Bitwise
	        System.out.println("Bitwise: " + (a&b) + " " + (a|b) + " " + (a^b) + " " + (~a));

	        // 5. Assignment
	        c = a; c+=2; c-=1; c*=2; c/=2; 
	        System.out.println("Assignment: " + c);

	        // 6. Unary
	        int d = 7;
	        System.out.println("Unary: " + (++d) + " " + (d--) + " " + (-d));

	        // 7. Ternary
	        System.out.println("Ternary: " + (a>b ? a : b));

	        // 8. Shift
	        System.out.println("Shift: " + (a<<1) + " " + (a>>1) + " " + (a>>>1));
	    }
	}


