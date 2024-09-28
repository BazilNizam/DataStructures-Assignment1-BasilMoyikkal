// Author: Basil Moyikkal
// ID: C0908488

package labyrinth;

public class LabyrinthPath {

    // inner class representing a node in the linked list
    class Node {
        // location of the node
        String location;
        // reference to the next node
        Node next;

        // constructor to initialize the node with a location
        Node(String location) {
            this.location = location;
            // next is null initially
            this.next = null;
        }
    }

    // starting point of the linked list
    Node head;

    // constructor to initialize an empty path
    public LabyrinthPath() {
        head = null;
    }

    // method to add a new location to the path
    public void addLocation(String location) {
        // create a new node with the given location
        Node newNode = new Node(location);
        if (head == null) {
            head = newNode; // set head to new node if the list is empty
        } else {
            Node current = head;
            // traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            // add the new node at the end
            current.next = newNode;
        }
        // print message when location is added
        System.out.println("Added location: " + location);
    }

    // method to remove the last visited location
    public void removeLastLocation() {
        if (head == null) {
            // print message if there are no locations to remove
            System.out.println("No locations to remove.");
            return;
        }

        if (head.next == null) {
            // print message when removing the only location
            System.out.println("Removing location: " + head.location);
            head = null; // remove the only location in the list
        } else {
            Node current = head;
            // traverse to the second last node
            while (current.next.next != null) {
                current = current.next;
            }
            // print message when removing the last location
            System.out.println("Removing location: " + current.next.location);
            current.next = null; // remove the last node
        }
    }

    // method to check if the path contains a loop (trap)
    public boolean containsLoop() {
        if (head == null || head.next == null) {
            // no loop if the path is empty or has only one location
            return false;
        }

        Node slow = head;
        Node fast = head;

        // Floyd's Cycle Detection Algorithm (Tortoise and Hare)
        while (fast != null && fast.next != null) {
            slow = slow.next;        // move slow pointer one step
            fast = fast.next.next;   // move fast pointer two steps

            if (slow == fast) {
                return true; // loop detected
            }
        }
        return false; // no loop detected
    }

    // method to print the entire path
    public void printPath() {
        if (head == null) {
            // print message if the path is empty
            System.out.println("The path is empty.");
            return;
        }

        Node current = head;
        System.out.print("Current path: ");
        while (current != null) {
            // print the current location
            System.out.print(current.location + " -> ");
            current = current.next;
        }
        // indicate the end of the path
        System.out.println("End");
    }
}
