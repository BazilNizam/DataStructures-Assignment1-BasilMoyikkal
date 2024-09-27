package labyrinth;

public class Main {
    public static void main(String[] args) {
        // Create an instance of LabyrinthPath
        LabyrinthPath path = new LabyrinthPath();

        // Adding locations to the path
        path.addLocation("Entrance");
        path.addLocation("Hallway");
        path.addLocation("Chamber");
        path.addLocation("Treasure Room");

        // Printing the current path
        path.printPath();

        // Removing the last location
        path.removeLastLocation();
        path.printPath();

        // Checking for loops in the path
        System.out.println("Does the path contain a loop? " + path.containsLoop());

        // To simulate a loop, we'll manually create one
        System.out.println("Creating a loop...");
        LabyrinthPath.Node head = path.head; // Access the head of the list
        if (head != null && head.next != null) {
            head.next.next.next = head; // Create a loop by pointing back to an earlier node
        }

        // Checking again for loops
        System.out.println("Does the path contain a loop? " + path.containsLoop());
    }
}
