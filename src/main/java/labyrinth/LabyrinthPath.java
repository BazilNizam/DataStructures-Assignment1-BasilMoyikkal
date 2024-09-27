package labyrinth;

public class LabyrinthPath {

    // Inner class representing a node in the linked list
    class Node {
        String location;
        Node next;

        Node(String location) {
            this.location = location;
            this.next = null;
        }
    }

    Node head; // Starting point of the linked list

    // Constructor to initialize an empty path
    public LabyrinthPath() {
        head = null;
    }

    // Method to add a new location to the path
    public void addLocation(String location) {
        Node newNode = new Node(location);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added location: " + location);
    }

    // Method to remove the last visited location
    public void removeLastLocation() {
        if (head == null) {
            System.out.println("No locations to remove.");
            return;
        }

        if (head.next == null) {
            System.out.println("Removing location: " + head.location);
            head = null; // Remove the only location in the list
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            System.out.println("Removing location: " + current.next.location);
            current.next = null; // Remove the last node
        }
    }

    // Method to check if the path contains a loop (trap)
    public boolean containsLoop() {
        if (head == null || head.next == null) {
            return false; // No loop if the path is empty or has only one location
        }

        Node slow = head;
        Node fast = head;

        // Floyd's Cycle Detection Algorithm (Tortoise and Hare)
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer one step
            fast = fast.next.next;   // Move fast pointer two steps

            if (slow == fast) {
                return true; // Loop detected
            }
        }
        return false; // No loop detected
    }

    // Method to print the entire path
    public void printPath() {
        if (head == null) {
            System.out.println("The path is empty.");
            return;
        }

        Node current = head;
        System.out.print("Current path: ");
        while (current != null) {
            System.out.print(current.location + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }
}
