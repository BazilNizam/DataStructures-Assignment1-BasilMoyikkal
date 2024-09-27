package explorerqueue;

public class Main {
    public static void main(String[] args) {
        // Create a queue with a capacity of 5 explorers
        ExplorerQueue queue = new ExplorerQueue(5);

        // Enqueue some explorers
        queue.enqueue("Indiana Jones");
        queue.enqueue("Lara Croft");
        queue.enqueue("Nathan Drake");

        // Show the next explorer in line
        queue.nextExplorer();

        // Dequeue an explorer (they enter the temple)
        queue.dequeue();

        // Show the next explorer after one has entered the temple
        queue.nextExplorer();

        // Enqueue more explorers
        queue.enqueue("Rick O'Connell");
        queue.enqueue("Allan Quatermain");

        // Print the current queue
        queue.printQueue();

        // Try to add more explorers than the queue can handle
        queue.enqueue("Jack Sparrow");
        queue.enqueue("John Carter"); // This should not be added, queue will be full

        // Dequeue all explorers
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Should remove the last one

        // Try to dequeue when the queue is empty
        queue.dequeue();

        // Print the queue to see if it's empty
        queue.printQueue();
    }
}
