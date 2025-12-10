package org.vanier.labs.lab9;

/*
 * ========================================================
 * TASK 2: Search for a Value in a Binary Tree
 * ========================================================
 *
 * Assignment Instructions:
 * 1. Write a method to check whether a value exists in the binary tree.
 * 2. Test the method by searching for two values: 12 and 21.
 * 3. Print whether each value is found or not in the tree.
 */

public class Task2 {
    public static void main(String[] args) {

        // Step 1: Build the tree using the same values as in Task 1
        MyBinaryTree2 tree = new MyBinaryTree2();
        int[] values = {15, 10, 20, 8, 12, 17, 25};
        for (int val : values) {
            tree.insert(val);
        }

        // Step 2: Search for the values 12 and 21
        int[] searchValues = {12, 21};
        for (int target : searchValues) {
            boolean found = tree.search(target);
            System.out.println("Value " + target + (found ? " was found." : " was not found."));
        }

        /*
         * Step 3: Explanation
         * This program builds a binary search tree (BST) and checks whether
         * specific values (12 and 21) exist in it.
         *
         * The search function uses the BST property to find values:
         *   - Go left if the value is smaller than current node
         *   - Go right if it's greater
         *
         * Since 12 is one of the inserted values, the search will return true.
         * Since 21 was never inserted, the search will return false.
         *
         * ✅ Output:
         * Value 12 was found.
         * Value 21 was not found.
         */
    }
}

class MyBinaryTree2 {
    private Node2 root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node2 insertRec(Node2 current, int value) {
        if (current == null) {
            return new Node2(value);
        }

        if (value < current.data) {
            current.left = insertRec(current.left, value);
        } else if (value > current.data) {
            current.right = insertRec(current.right, value);
        }
        return current;
    }

    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node2 current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.data) {
            return true;
        } else if (value < current.data) {
            return searchRec(current.left, value);
        } else {
            return searchRec(current.right, value);
        }
    }
}

class Node2 {
    int data;
    Node2 left, right;

    public Node2(int data) {
        this.data = data;
        left = right = null;
    }
}
