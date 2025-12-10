package org.vanier.labs.lab6;

/**
 * Task 1: MyArrayList - Core Operations (Easy)
 * Goal: Implement the fundamental components of an array-backed list.
 * Create a generic class MyArrayList<T>:
 * Declare the essential internal state: Object[] elements; and int size;.
 * Implement a constructor that initializes elements with a default capacity (e.g., 10) and size to 0.
 * Implement add(T element):
 * This method should add an element to the end of the list.
 * Ensure it handles the resize() logic: if the internal array is full, create a new array (e.g., double the size), copy existing elements, and update the elements reference.
 * Implement int size():
 * Return the current number of elements in the list.
 * Demonstrate: In your LabTest class, create a MyArrayList<String>. Add at least 15-20 strings (to trigger resize), then print the size and some elements to show they were added.
 */

//create a generic class MyArrayList<T>
public class MyArrayList<T> {
    //Declare Object[] elements
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Default Constructor
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Add element to the end of the list
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // Returns current number of elements
    public int size() {
        return size;
    }

    // Helper: Resize the internal array when full
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    // For testing: Get element at index
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) elements[index];
    }
}

