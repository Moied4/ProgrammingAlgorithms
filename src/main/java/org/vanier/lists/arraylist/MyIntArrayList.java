package org.vanier.lists.arraylist;
import java.util.Arrays;


import java.util.Arrays;

public class MyIntArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int size;

    // Default constructor
    public MyIntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY]; // Fix: initialize with default capacity
        this.size = 0;
    }

    // Constructor with custom capacity
    public MyIntArrayList(int initialCapacity) {
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elements = new int[initialCapacity];
        this.size = 0;
    }

    // Add element at the end
    public void add(final int element){
        if (size == elements.length){
            resize();
        }
        elements[size++] = element;
    }

    // Resize logic
    private void resize() {
        int newCapacity;
        if (elements.length == 0) {
            newCapacity = DEFAULT_CAPACITY;
        } else {
            newCapacity = elements.length * 2;
        }

        this.elements = Arrays.copyOf(elements, newCapacity);
        System.out.println("This arrayCapacity is: " + newCapacity);
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return elements[index];
    }

    // Remove element at index
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        int removed = elements[index];

        // Shift elements left to fill the gap
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[--size] = 0; // Good practice: clear the unused element
        return removed;
    }

    // Get current size
    public int size() {
        return size;
    }

    // Main method for testing
    public static void main(String[] args) {
        MyIntArrayList list = new MyIntArrayList(); // Fix: use correct class name

        // Add elements from 1 to 8
        for (int i = 1; i <= 8; i++) {
            list.add(i); // Fix: move inside loop block
        }

        // Print elements
        System.out.println("Initial List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nRemoving index 3...");
        list.remove(3);

        // Print list after removal
        System.out.println("After Removal:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
