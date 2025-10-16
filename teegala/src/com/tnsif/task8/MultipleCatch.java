package com.tnsif.task8;

public class MultipleCatch {

    public static void main(String[] args) {
        System.out.println("Program started...");

        try {
            int[] arr = {10, 20, 30};

            // Force one exception at a time by uncommenting

            // 1. Arithmetic Exception
            int result = 10 / 0;

            // 2. ArrayIndexOutOfBounds Exception
            // int value = arr[5];

            // 3. NullPointer Exception
            // String str = null;
            // System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (Exception e) {
            // General catch for any other exception
            System.out.println("Caught General Exception: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
