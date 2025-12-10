package org.vanier.assignments.assignment5;

/**
 *Task 1: Runnable Lambda with Delay
 * Create a Runnable lambda that prints "Task started", waits 500 milliseconds (Hint: Thread.sleep()), then prints "Task finished". Run this in a new thread and wait for it to complete.
 *
 * Deliverables:
 *
 * Lambda implementing Runnable with multiple statements.
 * Code to start and join the thread.
 * Expected Output:
 * Task started
 * Task finished
 *
 */

public class Task1 {
    public static void main(String[] args) {
        // Lambda implementing Runnable with multiple statements
        Runnable task = () -> {
            System.out.println("Task started");
            try {
                Thread.sleep(500); // 500 milliseconds delay
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Task finished");
        };

        Thread thread = new Thread(task);
        thread.start();

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Task interrupted");
        }
    }
}

