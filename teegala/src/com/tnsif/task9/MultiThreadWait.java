package com.tnsif.task9;


	

	class SharedResource {
	    private boolean available = false;

	    public synchronized void produce() {
	        try {
	            System.out.println("Producer thread started...");
	            Thread.sleep(1000);

	            available = true;
	            System.out.println("Producer produced the item.");

	            notify(); // notify consumer
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public synchronized void consume() {
	        try {
	            while (!available) {
	                System.out.println("Consumer waiting for item...");
	                wait(); // consumer waits until notified
	            }
	            System.out.println("Consumer consumed the item.");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	public class MultiThreadWait {
	    public static void main(String[] args) {
	        SharedResource resource = new SharedResource();

	        Thread producer = new Thread(() -> resource.produce(), "Producer");
	        Thread consumer = new Thread(() -> resource.consume(), "Consumer");

	        consumer.start();  // Start consumer first (it will wait)
	        producer.start();  // Then start producer (it will notify)
	    }
	}


