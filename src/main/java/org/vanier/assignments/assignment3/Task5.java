package org.vanier.assignments.assignment3;

/*
Assignment #3: The Use of Data Structures (Stack, Queue, Binary Tree) and Recursion

Task 5 - Binary Tree: Insert & Inorder Traversal

Implement a binary search tree.
Insert 15, 10, 20, 8, 12.
Print an inorder traversal. What does this order correspond to?
*/

public class Task5 {

    // Define Node class for the Binary Search Tree
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    // Insert a value into the BST
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

    // Inorder traversal (Left, Root, Right)
    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        // Insert values into the BST
        int[] values = {15, 10, 20, 8, 12};
        for (int value : values) {
            root = insert(root, value);
        }

        // Perform inorder traversal
        System.out.println("Inorder traversal of the BST:");
        inorderTraversal(root);

        // Explanation
        System.out.println("\n\nExplanation:");
        System.out.println("Inorder traversal of a binary search tree prints values in ascending order.");
        System.out.println("So the result corresponds to the sorted list: 8 10 12 15 20");
    }
}
