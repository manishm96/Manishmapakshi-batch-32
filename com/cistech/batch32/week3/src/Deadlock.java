package com.cistech.batch32.week3.src;

public class Deadlock {
	
    public static void main(String[] args) {
    	
        
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // first thread
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Acquired resource 1");

                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource 2");
                }
            }
        });

        // second thread
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Acquired resource 2");

                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired resource 1");
                }
            }
        });

        
        thread1.start();
        thread2.start();

        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program terminated successfully.");
    }
}

