package org.vanier.lists.linkedlist;

public class MySinglyLinkedList {

    Node head; // The head of the linked list

    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        // Inserting values into the list
        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(11);

        // Printing the list
        list.printlinkedlist(); // Output: 5 -> 7 -> 9 -> 11 -> null

        // Deleting a value from the list
        list.delete(5);

        // Printing the list after deletion
        list.printlinkedlist(); // Output should reflect deletion
    }

    public MySinglyLinkedList() {
        this.head = null; // Initialize the list as empty
    }

    public void delete(int value) {
        Node current = head; // Delete
        Node previous = null;

        // Check if head node itself holds the value to be deleted
        if (current != null && current.data == value) {
            head = current.next; // Move head to next node
            return;
        }

        // Search for the value to be deleted, keep track of previous node
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        // If value was found
        if (current != null) {
            previous.next = current.next;
        } else {
            // If value was not found in the list
            System.out.println(value + " Value not found");
        }
    }

    public void insert(int data) {
        // Created a new node with provided data
        Node newNode = new Node(data);

        // Checking if head is null, if yes newNode is assigned to the head
        if (head == null) {
            head = newNode;
        } else {
            // If head is not null, we bring the pointer to the head
            Node current = head;

            // We check if the pointer's 'next' field is not null
            while (current.next != null) {
                // If the pointer's 'next' field is not null,
                // we assign the pointer to the pointer's next node
                current = current.next;
            }

            // Once the pointer's next is null, we reach the end of the list
            // and assign the new node to the pointer's 'next' field
            current.next = newNode;
        }
    }

    public void printlinkedlist() {
        Node current = head;

        while (current != null) {
            // Print the data in the current node followed by an arrow
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        // Print null to indicate the end of the list
        System.out.println("null");
    }
}
