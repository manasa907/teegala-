package com.tnsif.task2;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int digits = String.valueOf(num).length(); // count digits
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");

        sc.close();
    }
}
