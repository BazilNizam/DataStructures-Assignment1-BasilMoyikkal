// Author: Basil Moyikkal
// ID: C0908488

package labyrinth;

public class Main {
    public static void main(String[] args) {
        // create an instance of LabyrinthPath
        LabyrinthPath path = new LabyrinthPath();

        // adding locations to the path
        path.addLocation("Entrance");
        path.addLocation("Hallway");
        path.addLocation("Chamber");
        path.addLocation("Treasure Room");

        // printing the current path
        path.printPath();

        // removing the last location
        path.removeLastLocation();
        path.printPath();

        // checking for loops in the path
        System.out.println("Does the path contain a loop? " + path.containsLoop());

        // to simulate a loop, we'll manually create one
        System.out.println("Creating a loop...");
        // get the head of the path
        LabyrinthPath.Node head = path.head;

        if (head != null && head.next != null) {
            // create a loop by pointing back to an earlier node
            head.next.next.next = head;
        }

        // checking again for loops
        System.out.println("Does the path contain a loop? " + path.containsLoop());
    }
}
