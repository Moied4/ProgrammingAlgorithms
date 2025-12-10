package org.vanier.labs.lab6;

/**Task 2: MyLinkedList - Head/Tail Operations (Easy)
 Goal: Understand node creation and pointer manipulation for list ends.
 Create a generic class MyLinkedList<T>:
 Define the private static class Node<T> inner class as provided in the content (with data, next, prev).
 Declare the essential internal state: Node<T> head;, Node<T> tail;, and int size;.
 Implement a constructor to initialize head, tail to null and size to 0.
 Implement addFirst(T element):
 Adds an element to the beginning of the list. Handle empty list and non-empty list cases by updating head and relevant node pointers.
 Implement T removeFirst():
 Removes and returns the element from the beginning of the list. Handle empty list and single-element list cases. Update head and relevant node pointers.
 Implement int size():
 Return the current number of elements in the list.
 Demonstrate: In LabTest, create a MyLinkedList<Integer>. Add a few elements using addFirst(), then removeFirst() a few times. Print the list's size after each operation.
 */

public class MyLinkedList<T> {
    // Inner Node class
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    // Fields
    private Node<T> head;
    private Node<T> tail;
    private int size;

    // Constructor
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add at the beginning
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) { // Empty list
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Remove from the beginning
    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        T removedData = head.data;

        if (head == tail) { // Single element
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedData;
    }

    // Return current size
    public int size() {
        return size;
    }

    // print list
    public void printList() {
        Node<T> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
