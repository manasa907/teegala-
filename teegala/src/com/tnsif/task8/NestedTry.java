package com.tnsif.task8;

public class NestedTry {

    public static void main(String[] args) {
        System.out.println("Program started...");

        try {
            // Outer try
            int a = 10, b = 2;
            int result = a / b;
            System.out.println("Division result: " + result);

            try {
                // Middle try
                int[] arr = {1, 2, 3};
                System.out.println("Accessing element: " + arr[1]);

                try {
                    // Inner-most try
                    String str = null;
                    System.out.println("String length: " + str.length()); // NullPointerException
                } catch (NullPointerException e) {
                    System.out.println("Inner-most catch: " + e);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Middle catch: " + e);
            }

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues after multi-nested try-catch...");
    }
}
