package com.tnsif.task6;

//Interface jio
interface jio {
 void call(); // Abstract method to be implemented
 void sms();  // Abstract method to be implemented
}

//Abstract class Phone implementing jio
abstract class Phone implements jio {
 // Abstract method that must be implemented by subclasses
 public abstract void call();

 // Concrete method with implementation
 public void sms() {
     System.out.println("Sending SMS from Phone");
 }
}

//Concrete class samsung extending Phone
class samsung extends Phone {
 // Implementing the abstract call method
 public void call() {
     System.out.println("Calling from Samsung phone");
 }
}

//Main class to test the code
public class Main {
 public static void main(String[] args) {
     samsung myPhone = new samsung();
     myPhone.call(); // Output: Calling from Samsung phone
     myPhone.sms();  // Output: Sending SMS from Phone
 }
}
