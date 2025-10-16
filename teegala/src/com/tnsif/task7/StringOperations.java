package com.tnsif.task7;

public class StringOperations {

	    public static void main(String[] args) {
	        // Create strings
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = "Hello";

	        // 1. Length
	        System.out.println("Length of str1: " + str1.length());

	        // 2. Concatenation
	        String result = str1.concat(" " + str2);
	        System.out.println("Concatenation: " + result);

	        // 3. To Upper Case
	        System.out.println("Uppercase: " + str1.toUpperCase());

	        // 4. To Lower Case
	        System.out.println("Lowercase: " + str2.toLowerCase());

	        // 5. charAt
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 6. Substring
	        System.out.println("Substring of str2 (1 to 4): " + str2.substring(1, 4));

	        // 7. Equals
	        System.out.println("str1 equals str3? " + str1.equals(str3));
	        System.out.println("str1 equals str2? " + str1.equals(str2));

	        // 8. CompareTo
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
	        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

	        // 9. Contains
	        System.out.println("str2 contains 'or'? " + str2.contains("or"));

	        // 10. Replace
	        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));

	        // 11. Trim
	        String str4 = "   Java Programming   ";
	        System.out.println("Before trim: '" + str4 + "'");
	        System.out.println("After trim: '" + str4.trim() + "'");
	    }
	}
