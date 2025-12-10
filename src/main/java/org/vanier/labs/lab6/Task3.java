package org.vanier.labs.lab6;

/**Task 3: MyArrayList - Access & Removal by Index (Medium)
 Goal: Practice precise element access and array shifting.
 Continue with your MyArrayList<T> from Task 1.
 Implement T get(int index):
 Return the element at the specified index.
 Include bounds checking: throw an IndexOutOfBoundsException if index is invalid.
 Implement T remove(int index):
 Remove and return the element at the specified index.
 Include bounds checking.
 Perform the necessary element shifting to fill the gap created by the removal.
 Set the last element's reference to null after removal (good practice).
 Demonstrate: In LabTest, create a MyArrayList<String>. Add at least 5-7 elements. Use get() to retrieve elements at various valid indices. Then, remove() elements from the middle and beginning, printing the list's state (e.g., by repeatedly calling get() and size()) after each removal to confirm correctness.
*/

public class Task3 {
    public static void main(String[] args) {
        MyArrayList3<String> list = new MyArrayList3<>();

        // Add 7 elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Orange");
        list.add("Peach");
        list.add("Grape");

        list.printAll();
        System.out.println("Size: " + list.size());

        // Test get()
        System.out.println("\nGet index 0: " + list.get(0)); // Apple
        System.out.println("Get index 3: " + list.get(3));   // Date
        System.out.println("Get index 6: " + list.get(6));   // Grape

        // Test remove() from middle
        System.out.println("\nRemoved from index 3: " + list.remove(3)); // removes "Date"
        list.printAll();
        System.out.println("Size: " + list.size());

        // Test remove() from beginning
        System.out.println("\nRemoved from index 0: " + list.remove(0)); // removes "Apple"
        list.printAll();
        System.out.println("Size: " + list.size());

        // Optional: Remove last
        System.out.println("\nRemoved from last index: " + list.remove(list.size() - 1)); // removes "Grape"
        list.printAll();
        System.out.println("Size: " + list.size());
    }
}

/**get(int index)	O(1)	Direct access using array indexing. No traversal or shifting required.
 *remove(int index)	O(n)	Requires shifting all elements after the removed index one position to the left.
 *add(T element)	O(1)    (amortized)	Adds to end of array. If array is full, resizing (copying) happens, which is O(n), but amortized cost remains O(1).
 *size()	        O(1)	        Constant-time: returns stored size variable.
 *printAll()        O(n)	Loops through all elements to print them.
*/
