package org.vanier.lists.stacks;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> list = new LinkedList<>();

    // Push element onto the stack
    public void push(String element) {
        list.addFirst(element);
    }

    // Pop (remove and return) the top element
    public String pop() {
        if (!list.isEmpty()) {
            return list.removeFirst();
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    // Peek (return but do not remove) the top element
    public String peek() {
        if (!list.isEmpty()) {
            return list.getFirst();
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("Top element (peek): " + stack.peek());  // Should print "3"
        System.out.println("Popped element: " + stack.pop());        // Should remove and print "3"
        System.out.println("Top after pop: " + stack.peek());        // Should print "2"
        System.out.println("Is stack empty? " + stack.isEmpty());    // Should print false
    }
}
