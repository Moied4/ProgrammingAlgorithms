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

public class Task2 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Add elements using addFirst()
        list.addFirst(10);
        list.printList();
        System.out.println("Size after addFirst(10): " + list.size());

        list.addFirst(20);
        list.printList();
        System.out.println("Size after addFirst(20): " + list.size());

        list.addFirst(30);
        list.printList();
        System.out.println("Size after addFirst(30): " + list.size());

        // Remove elements using removeFirst()
        System.out.println("Removed: " + list.removeFirst());
        list.printList();
        System.out.println("Size after removeFirst(): " + list.size());

        System.out.println("Removed: " + list.removeFirst());
        list.printList();
        System.out.println("Size after removeFirst(): " + list.size());

        System.out.println("Removed: " + list.removeFirst());
        list.printList();
        System.out.println("Size after removeFirst(): " + list.size());
    }
}

/** Time Complexity	Explanation
 *addFirst(T element)	Adds to the beginning of the list	O(1)	No traversal; just pointer updates at the head.
 *
 * removeFirst()	Removes from the beginning of the list	O(1)	No traversal; only a reference update. Handles edge cases efficiently.
 *
 * size()	Returns the current number of elements	O(1)	Size is tracked as an int and returned directly.
 */
