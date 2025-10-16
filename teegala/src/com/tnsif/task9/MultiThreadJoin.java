package com.tnsif.task9;



class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " - Count: " + i);
                Thread.sleep(500); // Sleep for 0.5 sec
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}

public class MultiThreadJoin {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.start();
        try {
            t1.join(); // main thread waits until t1 finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join(); // main thread waits until t2 finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
            t3.join(); // main thread waits until t3 finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished. Main thread exiting.");
    }
}

