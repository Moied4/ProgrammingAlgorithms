package org.vanier.labs.lab11;

/**
 * Task 1: Simple Lambda for Runnable and Invocation
 * Write a lambda expression implementing Runnable that prints "Hello from Runnable!" when run. Then, create a new Thread using this Runnable, start the thread, and ensure the message is printed.
 *
 * Requirements:
 *
 * Use a lambda expression to instantiate Runnable.
 *
 * Start the thread to execute the lambda.
 *
 * Print a confirmation message inside the lambda.
 */

public class Task1 {
    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello from Runnable! " + Thread.currentThread().getName());

        Thread thread = new Thread(task);

        thread.start();
    }
}
