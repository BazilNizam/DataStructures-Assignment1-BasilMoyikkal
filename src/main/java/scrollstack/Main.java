package scrollstack;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ScrollStack
        ScrollStack stack = new ScrollStack();

        // Push some scrolls onto the stack
        stack.pushScroll("Ancient Scroll of Wisdom");
        stack.pushScroll("Scroll of the Forbidden Temple");
        stack.pushScroll("Scroll of the Lost City");

        // Peek at the top scroll
        stack.peekScroll();

        // Check if a specific scroll is in the stack
        stack.containsScroll("Scroll of the Forbidden Temple");

        // Pop the top scroll off the stack
        stack.popScroll();

        // Peek again at the top scroll
        stack.peekScroll();

        // Print all remaining scrolls
        stack.printAllScrolls();

        // Check for a scroll that was removed
        stack.containsScroll("Scroll of the Lost City");
    }
}
