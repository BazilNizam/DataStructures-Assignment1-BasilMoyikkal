// Author: Basil Moyikkal
// ID: C0908488

package explorerqueue;

public class ExplorerQueue {
    // array to store explorers
    private String[] queue;
    // index of the front of the queue
    private int front;
    // index of the rear of the queue
    private int rear;
    // current size of the queue
    private int size;
    // maximum capacity of the queue
    private int capacity;

    // constructor to initialize the queue with a specific capacity
    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        // array to hold explorers
        queue = new String[capacity];
        // front starts at 0
        front = 0;
        // rear starts at -1, meaning it's empty
        rear = -1;
        // initially, the queue is empty
        size = 0;
    }

    // check if the queue is full
    public boolean isFull() {
        // when size reaches capacity, it's full
        return size == capacity;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        // when size is 0, the queue is empty
        return size == 0;
    }

    // enqueue: add an explorer to the queue
    public void enqueue(String explorerName) {
        if (isFull()) {
            // print message if queue is full
            System.out.println("The queue is full. Cannot add explorer: " + explorerName);
        } else {
            // circular increment of rear
            rear = (rear + 1) % capacity;
            // add explorer to the rear of the queue
            queue[rear] = explorerName;
            // increase the size
            size++;
            // print message when explorer is added
            System.out.println("Explorer added to the queue: " + explorerName);
        }
    }

    // dequeue: remove an explorer from the front of the queue
    public void dequeue() {
        if (isEmpty()) {
            // print message if queue is empty
            System.out.println("The queue is empty. No explorers to remove.");
        } else {
            // print the explorer entering the temple
            System.out.println("Explorer entering the temple: " + queue[front]);
            // circular increment of front
            front = (front + 1) % capacity;
            // decrease the size
            size--;
        }
    }

    // display the next explorer in line without removing them
    public void nextExplorer() {
        if (isEmpty()) {
            // print message if queue is empty
            System.out.println("The queue is empty. No explorers in line.");
        } else {
            // print the next explorer in line
            System.out.println("Next explorer in line: " + queue[front]);
        }
    }

    // print the entire queue
    public void printQueue() {
        if (isEmpty()) {
            // print message if queue is empty
            System.out.println("The queue is empty.");
        } else {
            System.out.print("Current queue: ");
            for (int i = 0; i < size; i++) {
                // circular indexing
                int index = (front + i) % capacity;
                // print the explorer at the current index
                System.out.print(queue[index] + " ");
            }
            // new line after printing the queue
            System.out.println();
        }
    }
}
