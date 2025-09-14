package com.tnsif.task1;
import java.util.Scanner;

public class Datatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = sc.nextLine();

        // Detect Data Type
        if (isInteger(input)) {
            System.out.println("Data Type: Integer");
        } else if (isLong(input)) {
            System.out.println("Data Type: Long");
        } else if (isFloat(input)) {
            System.out.println("Data Type: Float");
        } else if (isDouble(input)) {
            System.out.println("Data Type: Double");
        } else if (isChar(input)) {
            System.out.println("Data Type: Character");
        } else {
            System.out.println("Data Type: String");
        }

        sc.close();
    }

    // Helper methods for type checking
    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return str.contains(".");
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return str.contains(".");
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isChar(String str) {
        return str.length() == 1 && !Character.isDigit(str.charAt(0));
    }
}
