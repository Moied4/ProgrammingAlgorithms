package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Task 6 - Find Minimum and Maximum in BST

Write two methods for your binary search tree:
findMin() to return the smallest value in the BST.
findMax() to return the largest value in the BST.
Insert 15, 10, 20, 8, 12, 17, 25 into your BST and print the results of both methods.
*/

public class Task6 {

    // Node class for the Binary Search Tree
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    // Insert method
    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Find minimum value (leftmost node)
    static int findMin(Node root) {
        if (root == null) throw new IllegalArgumentException("Tree is empty");

        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    // Find maximum value (rightmost node)
    static int findMax(Node root) {
        if (root == null) throw new IllegalArgumentException("Tree is empty");

        while (root.right != null) {
            root = root.right;
        }
        return root.value;
    }

    public static void main(String[] args) {
        Node root = null;

        // Insert values into the BST
        int[] values = {15, 10, 20, 8, 12, 17, 25};
        for (int value : values) {
            root = insert(root, value);
        }

        // Find and print min and max
        int min = findMin(root);
        int max = findMax(root);

        System.out.println("Minimum value in the BST: " + min);
        System.out.println("Maximum value in the BST: " + max);

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("In a BST, the minimum is the leftmost node, and the maximum is the rightmost node.");
        System.out.println("So for the given tree, min = 8 and max = 25.");
    }
}
