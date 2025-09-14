package com.tnsif.task1;

public class Variables {

    // Instance variable (different for each object)
    int instanceVar = 10;

    // Global (static) variable (same for all objects)
    static int globalVar = 20;

    public static void main(String[] args) {
        // Create two objects
        Variables obj1 = new Variables();
        Variables obj2 = new Variables();

        // Access instance variable (via object)
        System.out.println("Object 1 - Instance Variable: " + obj1.instanceVar);
        System.out.println("Object 2 - Instance Variable: " + obj2.instanceVar);

        // Access static (global) variable (via class name)
        System.out.println("Global (Static) Variable: " + Variables.globalVar);

        // Change values
        obj1.instanceVar = 50;     // only affects obj1
        Variables.globalVar = 100; // affects all objects

        System.out.println("\nAfter changing values:");
        System.out.println("Object 1 - Instance Variable: " + obj1.instanceVar);
        System.out.println("Object 2 - Instance Variable: " + obj2.instanceVar);
        System.out.println("Global (Static) Variable: " + Variables.globalVar);
    }
}
