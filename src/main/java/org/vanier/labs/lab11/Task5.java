package org.vanier.labs.lab11;

public class Task5 {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Task started...");

            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Task was interrupted.");
            }

            System.out.println("Task completed!");
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}

