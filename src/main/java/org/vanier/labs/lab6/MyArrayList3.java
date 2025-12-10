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

public class MyArrayList3<T> {
    private Object[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList3() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }

    //  Get element at index
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    //   Remove element at index
    public T remove(int index) {
        checkIndex(index);
        T removed = (T) data[index];

        // Shift elements left to fill the gap
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // Null out last element to avoid memory leak
        data[size - 1] = null;
        size--;
        return removed;
    }

    public int size() {
        return size;
    }

    // Helper: print all elements
    public void printAll() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Internal helpers
    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
