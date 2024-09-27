package scrollstack;

import java.util.Stack;

public class ScrollStack {
    // We will use the built-in Java Stack class to manage the scrolls
    private Stack<String> stack;

    // Constructor to initialize the scroll stack
    public ScrollStack() {
        stack = new Stack<>();
    }

    // Push a new scroll onto the stack
    public void pushScroll(String scrollTitle) {
        stack.push(scrollTitle);
        System.out.println("Added scroll: " + scrollTitle);
    }

    // Pop the top scroll off the stack
    public void popScroll() {
        if (stack.isEmpty()) {
            System.out.println("No scrolls to remove.");
        } else {
            String removedScroll = stack.pop();
            System.out.println("Removed scroll: " + removedScroll);
        }
    }

    // Peek at the top scroll without removing it
    public void peekScroll() {
        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("No scrolls in the stack.");
        } else {
            System.out.println("Top scroll: " + stack.peek());
        }
    }

    // Check if a specific scroll title exists in the stack
    public void containsScroll(String scrollTitle) {
        // Use the contains method of the Stack class
        if (stack.contains(scrollTitle)) {
            System.out.println("Scroll \"" + scrollTitle + "\" exists in the stack.");
        } else {
            System.out.println("Scroll \"" + scrollTitle + "\" is not in the stack.");
        }
    }

    // Print all scrolls in the stack
    public void printAllScrolls() {
        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The scroll stack is empty.");
        } else {
            System.out.println("Scrolls in the stack: " + stack);
        }
    }
}
