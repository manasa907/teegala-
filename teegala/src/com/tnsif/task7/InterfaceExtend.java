package com.tnsif.task7;

// First interface
interface Animal {
    void eat();
}

// Second interface extending the first
interface Dog extends Animal {
    void bark();
}

// Class implementing the child interface
class Puppy implements Dog {
    // Must override both methods (from Animal and Dog)
    public void eat() {
        System.out.println("Puppy is eating...");
    }

    public void bark() {
        System.out.println("Puppy is barking...");
    }
}

// Main class (this should match the filename InterfaceExtend.java)
public class InterfaceExtend {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();   // from Animal interface
        obj.bark();  // from Dog interface
    }
}
