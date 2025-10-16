package com.tnsif.task4;

//Parent class
class Super {
 void display() {
     System.out.println("This is the Parent class (Super) method");
 }
}

//Child class
class Sub extends Super {
 void display() {
     System.out.println("This is the Child class (Sub) method");
 }

 void show() {
     // Call parent class method using super
     super.display();  
     // Call child class method
     this.display();  
 }
}

//Main class
public class SuperDemo {
 public static void main(String[] args) {
     Sub obj = new Sub();
     obj.show();
 }
}

