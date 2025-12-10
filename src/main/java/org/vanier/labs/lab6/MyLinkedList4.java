package org.vanier.labs.lab6;

/**Task 4: MyLinkedList - Indexed Access & Insertion (Medium)
 Goal: Master list traversal and pointer manipulation for middle operations.
 Continue with your MyLinkedList<T> from Task 2.
 Implement T get(int index):
 Return the element at the specified index.
 Include bounds checking.
 This requires traversing the list from the head (or tail for efficiency) to reach the desired node.
 Implement void add(int index, T element):
 Inserts an element at the specified index.
 Include bounds checking.
 Handle edge cases for index 0 (equivalent to addFirst) and index size (equivalent to addLast).
 For other indices, traverse to the correct position, then update the next and prev pointers of the new node and its neighbors.
 Demonstrate: In LabTest, create a MyLinkedList<Character>.
 Add some characters using addFirst() and addLast().
 Use get() to access elements at different indices, printing them.
 Use add(index, element) to insert elements in the middle of the list.
 After each insertion, verify the list's contents by repeatedly calling get() or by printing elements (you might need a simple toString() for debugging if you wish).
*/

public class MyLinkedList4<T> {
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
    public MyLinkedList4() {
        head = tail = null;
        size = 0;
    }

    // Add at front
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add at end
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Task 4: Get element by index
    public T get(int index) {
        checkIndex(index);
        Node<T> current = getNodeAt(index);
        return current.data;
    }

    // Task 4: Add element at index
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<T> nextNode = getNodeAt(index);
            Node<T> prevNode = nextNode.prev;
            Node<T> newNode = new Node<>(element);

            newNode.prev = prevNode;
            newNode.next = nextNode;
            prevNode.next = newNode;
            nextNode.prev = newNode;
            size++;
        }
    }

    // Helper: Traverse to index efficiently from head or tail
    private Node<T> getNodeAt(int index) {
        checkIndex(index);
        Node<T> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    // Size method
    public int size() {
        return size;
    }

    // Print list
    public void printList() {
        Node<T> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
}

