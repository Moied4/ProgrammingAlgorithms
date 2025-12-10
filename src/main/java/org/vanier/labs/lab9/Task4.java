package org.vanier.labs.lab9;

/*
 * ========================================================
 * TASK 4: Print All Leaf Nodes
 * ========================================================
 *
 * 1. Write a method to print all the leaf nodes (nodes with no children) of the tree.
 * 2. Run this method for the tree built from the values in Task 1.
 * 3. Print the leaf node values.
 */

public class Task4 {
    public static void main(String[] args) {

        MyBinaryTree4 tree = new MyBinaryTree4();
        int[] values = {15, 10, 20, 8, 12, 17, 25};

        // Step 1: Build the tree by inserting values
        for (int val : values) {
            tree.insert(val);
        }

        // Step 2 & 3: Print all leaf nodes of the tree
        System.out.print("Leaf nodes: ");
        tree.printLeafNodes();
        System.out.println();

        /*
         * Explanation:
         * Leaf nodes are nodes with no children.
         * The printLeafNodes() method traverses the tree recursively,
         * printing all nodes with no left or right child.
         *
         * For this tree, the leaf nodes printed are: 8 12 17 25
         */
    }
}

class MyBinaryTree4 {
    private Node4 root;

    // Insert value into BST (Step 1: Build the tree)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper to insert nodes (Step 1: Build the tree)
    private Node4 insertRec(Node4 current, int value) {
        if (current == null) {
            return new Node4(value); // Create new node when empty position found
        }

        if (value < current.data) {
            current.left = insertRec(current.left, value);
        } else if (value > current.data) {
            current.right = insertRec(current.right, value);
        }
        return current;
    }

    // Start printing leaf nodes (Step 2 & 3: Print all leaf nodes)
    public void printLeafNodes() {
        printLeavesRec(root);
    }

    // Recursive traversal to find and print leaf nodes
    private void printLeavesRec(Node4 node) {
        if (node == null) {
            return; // Base case: empty subtree
        }

        // Step 2: Define leaf nodes as nodes with no children
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " "); // Step 3: Print leaf node value
        }

        // Step 2: Recursively traverse left and right subtrees
        printLeavesRec(node.left);
        printLeavesRec(node.right);
    }
}

class Node4 {
    int data;
    Node4 left, right;

    public Node4(int data) {
        this.data = data;
        left = right = null; // Leaf nodes initially have null children
    }
}


