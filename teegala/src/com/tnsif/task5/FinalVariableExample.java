package com.tnsif.task5;

public class FinalVariableExample {

    // Final variable
    final int MAX = 100;

    void show() {
        System.out.println("Maximum value: " + MAX);
        // Uncommenting below line will give error because final variables cannot be changed
        // MAX = 200;
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.show();
    }
}
