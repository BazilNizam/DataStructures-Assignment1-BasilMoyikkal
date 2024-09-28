// Author: Basil Moyikkal
// ID: C0908488

package scrollstack;

import java.util.Stack;

// Class representing a stack of scrolls
public class ScrollStack {
    // we will use the built-in Java Stack class to manage the scrolls
    private Stack<String> stack;

    // Constructor to initialize the scroll stack
    public ScrollStack() {
        // initializing the stack for storing scroll titles
        stack = new Stack<>();
    }

    // Push a new scroll onto the stack
    public void pushScroll(String scrollTitle) {
        // adding the scroll title to the top of the stack
        stack.push(scrollTitle);
        // informing that the scroll has been added
        System.out.println("Added scroll: " + scrollTitle);
    }

    // Pop the top scroll off the stack
    public void popScroll() {
        // checking if the stack is empty before attempting to pop
        if (stack.isEmpty()) {
            // no scrolls to remove, so print a message
            System.out.println("No scrolls to remove.");
        } else {
            // removing the scroll at the top of the stack
            String removedScroll = stack.pop();
            // informing which scroll has been removed
            System.out.println("Removed scroll: " + removedScroll);
        }
    }

    // Peek at the top scroll without removing it
    public void peekScroll() {
        // check if the stack is empty
        if (stack.isEmpty()) {
            // print a message if there are no scrolls
            System.out.println("No scrolls in the stack.");
        } else {
            // displaying the scroll currently at the top of the stack
            System.out.println("Top scroll: " + stack.peek());
        }
    }

    // Check if a specific scroll title exists in the stack
    public void containsScroll(String scrollTitle) {
        // use the contains method of the Stack class to check for the scroll
        if (stack.contains(scrollTitle)) {
            // informing that the scroll exists in the stack
            System.out.println("Scroll \"" + scrollTitle + "\" exists in the stack.");
        } else {
            // informing that the scroll does not exist in the stack
            System.out.println("Scroll \"" + scrollTitle + "\" is not in the stack.");
        }
    }

    // Print all scrolls in the stack
    public void printAllScrolls() {
        // check if the stack is empty
        if (stack.isEmpty()) {
            // print a message if the stack is empty
            System.out.println("The scroll stack is empty.");
        } else {
            // displaying all scrolls currently in the stack
            System.out.println("Scrolls in the stack: " + stack);
        }
    }
}
