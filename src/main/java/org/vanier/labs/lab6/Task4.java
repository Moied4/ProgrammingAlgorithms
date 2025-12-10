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

public class Task4 {
    public static void main(String[] args) {
        MyLinkedList4<Character> list = new MyLinkedList4<>();

        // Add with addFirst and addLast
        list.addFirst('C');  // List: C
        list.addLast('D');   // List: C D
        list.addFirst('B');  // List: B C D
        list.addFirst('A');  // List: A B C D
        list.addLast('E');   // List: A B C D E
        list.printList();

        // Get at various indices
        System.out.println("Element at index 0: " + list.get(0)); // A
        System.out.println("Element at index 2: " + list.get(2)); // C
        System.out.println("Element at index 4: " + list.get(4)); // E

        // Add at index
        list.add(2, 'X'); // Add X at index 2 → A B X C D E
        list.printList();

        list.add(0, 'Z'); // Add Z at head → Z A B X C D E
        list.printList();

        list.add(list.size(), 'Y'); // Add Y at tail → Z A B X C D E Y
        list.printList();

        // Final size
        System.out.println("Final size: " + list.size());
    }
}

/** BIG-O Complexity Summary
 * addFirst, addLast	O(1)	Direct head/tail manipulation
 * get(index)	O(n)	Traverses from head or tail
 * add(index, value)	O(n)	Traverses, then updates 4 pointers
 * size()	O(1)	Constant, tracked via size
 */