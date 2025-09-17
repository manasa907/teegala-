package com.tnsif.task5;

// Final class example
final class FinalClass {
    public void showMessage() {
        System.out.println("This is a final class. It cannot be inherited.");
    }
}

// Parent class with a final method
class Parent {
    final void display() {
        System.out.println("Final method in Parent class. Cannot be overridden.");
    }
}

class Child extends Parent {
    // ❌ If we try to override display(), it will cause a compile-time error
    // void display() { System.out.println("Trying to override"); }
}

public class Final {
    // Final variable
    final int finalVar = 100;

    public void showFinalVar() {
        System.out.println("Value of final variable = " + finalVar);

        // ❌ Uncommenting below line will cause an error
        // finalVar = 200;
    }

    public static void main(String[] args) {
        Final obj = new Final();
        obj.showFinalVar();

        Child c = new Child();
        c.display();

        FinalClass f = new FinalClass();
        f.showMessage();
    }
}
