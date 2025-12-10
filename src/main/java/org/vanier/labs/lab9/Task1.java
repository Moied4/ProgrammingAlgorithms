package org.vanier.labs.lab9;

/*
 * ========================================================
 * TASK 1: Insert and Display (Inorder Traversal)
 * ========================================================
 *
 * Assignment Instructions:
 * 1. Create a binary tree.
 * 2. Insert the values: 15, 10, 20, 8, 12, 17, 25 (in that order).
 * 3. Perform an inorder traversal and print the output.
 * 4. Explain what property of the binary tree is demonstrated by this traversal’s result.
 */

public class Task1 {
    public static void main(String[] args) {

        // Step 1: Create a binary tree instance
        MyBinaryTree tree = new MyBinaryTree();

        // Step 2: Insert specified values in the given order
        // This will build the structure of a Binary Search Tree (BST)
        int[] values = {15, 10, 20, 8, 12, 17, 25};
        for (int val : values) {
            tree.insert(val);
        }

        //  Step 3: Perform an inorder traversal and print the output
        // Inorder traversal of a BST should return a sorted sequence
        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal();

        /*
         *  Step 4: Explanation
         * Inorder traversal visits nodes in the following order:
         *   LEFT subtree → ROOT → RIGHT subtree
         * In a Binary Search Tree (BST), this results in the values being printed in **ascending order**.
         *
         * For the inserted values, the output will be:
         *   8 10 12 15 17 20 25
         *
         * This demonstrates the fundamental BST property:
         *   All left children are smaller than the parent,
         *   and all right children are greater.
         */
    }
}

//  Class to represent the binary tree and handle insertion and traversal
class MyBinaryTree {
    private Node root;

    // Insert a value into the tree
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper for inserting into BST
    private Node insertRec(Node current, int value) {
        if (current == null) {
            // Create new node when spot is found
            return new Node(value);
        }

        if (value < current.data) {
            current.left = insertRec(current.left, value);  // Go left
        } else if (value > current.data) {
            current.right = insertRec(current.right, value); // Go right
        }
        return current;
    }

    // Perform inorder traversal starting from root
    public void inorderTraversal() {
        inorderRec(root);
        System.out.println(); // Print newline after traversal
    }

    // Recursive inorder: Left -> Root -> Right
    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }
}

//  Basic Node class for the tree
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null; // Children start as null
    }
}
