// Author: Basil Moyikkal
// ID: C0908488

package scrollstack;

public class Main {
    public static void main(String[] args) {
        // create an instance of ScrollStack
        // this stack will hold our scrolls
        ScrollStack stack = new ScrollStack();

        // push some scrolls onto the stack
        // adding first scroll to the stack
        stack.pushScroll("Ancient Scroll of Wisdom");
        // adding second scroll to the stack
        stack.pushScroll("Scroll of the Forbidden Temple");
        // adding third scroll to the stack
        stack.pushScroll("Scroll of the Lost City");

        // peek at the top scroll
        // this will show the scroll that is currently at the top of the stack
        stack.peekScroll();

        // check if a specific scroll is in the stack
        // looking for the 'Scroll of the Forbidden Temple'
        stack.containsScroll("Scroll of the Forbidden Temple");

        // pop the top scroll off the stack
        // this will remove the scroll currently at the top
        stack.popScroll();

        // peek again at the top scroll
        // check which scroll is now at the top after popping one off
        stack.peekScroll();

        // print all remaining scrolls
        // this will display all scrolls that are still in the stack
        stack.printAllScrolls();

        // check for a scroll that was removed
        // looking for 'Scroll of the Lost City', which should still be in the stack
        stack.containsScroll("Scroll of the Lost City");
    }
}
