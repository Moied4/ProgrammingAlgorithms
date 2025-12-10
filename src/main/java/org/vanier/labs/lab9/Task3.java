package org.vanier.labs.lab9;

/*
 * ========================================================
 * TASK 3: Compute Tree Height
 * ========================================================
 *
 * Assignment Instructions:
 * 1. Write a method that returns the height (maximum depth) of the tree.
 * 2. Compute and print the tree’s height after inserting the values from Task 1.
 */

public class Task3 {
    public static void main(String[] args) {

        // Build the tree using the values from Task 1
        MyBinaryTree3 tree = new MyBinaryTree3();
        int[] values = {15, 10, 20, 8, 12, 17, 25};
        for (int val : values) {
            tree.insert(val);
        }

        // Compute the height of the tree
        int height = tree.getHeight();

        // Print the height
        System.out.println("Height of the tree: " + height);

        /*
         * Explanation
         * The height of a binary tree is the length of the longest path
         * from the root node down to the farthest leaf node.
         *
         * The method getHeight() uses recursion:
         *   - If the current node is null, height is 0.
         *   - Otherwise, height is 1 + max(height of left subtree, height of right subtree).
         *
         * For the given inserted values, the output is:
         * Height of the tree: 3
         *
         * This means the longest path from root to leaf is 3 edges deep.
         */
    }
}

class MyBinaryTree3 {
    private Node3 root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node3 insertRec(Node3 current, int value) {
        if (current == null) {
            return new Node3(value);
        }

        if (value < current.data) {
            current.left = insertRec(current.left, value);
        } else if (value > current.data) {
            current.right = insertRec(current.right, value);
        }
        return current;
    }

    // Method to compute height of the tree
    public int getHeight() {
        return heightRec(root);
    }

    private int heightRec(Node3 node) {
        if (node == null) {
            return 0; // base case: empty subtree
        }

        // Compute height of left and right subtrees
        int leftHeight = heightRec(node.left);
        int rightHeight = heightRec(node.right);

        // Height is max of left/right subtree heights plus 1 for current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

class Node3 {
    int data;
    Node3 left, right;

    public Node3(int data) {
        this.data = data;
        left = right = null;
    }
}
