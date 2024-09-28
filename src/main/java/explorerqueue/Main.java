// Author: Basil Moyikkal
// ID: C0908488

package explorerqueue;

public class Main {
    public static void main(String[] args) {
        // create a queue with a capacity of 5 explorers
        ExplorerQueue queue = new ExplorerQueue(5);

        // enqueue some explorers
        queue.enqueue("Indiana Jones");
        queue.enqueue("Lara Croft");
        queue.enqueue("Nathan Drake");

        // show the next explorer in line
        queue.nextExplorer();

        // dequeue an explorer (they enter the temple)
        queue.dequeue();

        // show the next explorer after one has entered the temple
        queue.nextExplorer();

        // enqueue more explorers
        queue.enqueue("Rick O'Connell");
        queue.enqueue("Allan Quatermain");

        // print the current queue
        queue.printQueue();

        // try to add more explorers than the queue can handle
        queue.enqueue("Jack Sparrow");
        queue.enqueue("John Carter"); // this should not be added, queue will be full

        // dequeue all explorers
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        // should remove the last one
        queue.dequeue();

        // try to dequeue when the queue is empty
        queue.dequeue();

        // print the queue to see if it's empty
        queue.printQueue();
    }
}
