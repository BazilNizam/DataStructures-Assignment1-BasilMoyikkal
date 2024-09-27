package explorerqueue;

public class ExplorerQueue {
    private String[] queue; // Array to store explorers
    private int front; // Index of the front of the queue
    private int rear; // Index of the rear of the queue
    private int size; // Current size of the queue
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the queue with a specific capacity
    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity]; // Array to hold explorers
        front = 0; // Front starts at 0
        rear = -1; // Rear starts at -1, meaning it's empty
        size = 0; // Initially, the queue is empty
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity; // When size reaches capacity, it's full
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0; // When size is 0, the queue is empty
    }

    // Enqueue: Add an explorer to the queue
    public void enqueue(String explorerName) {
        if (isFull()) {
            System.out.println("The queue is full. Cannot add explorer: " + explorerName);
        } else {
            rear = (rear + 1) % capacity; // Circular increment of rear
            queue[rear] = explorerName; // Add explorer to the rear of the queue
            size++; // Increase the size
            System.out.println("Explorer added to the queue: " + explorerName);
        }
    }

    // Dequeue: Remove an explorer from the front of the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty. No explorers to remove.");
        } else {
            System.out.println("Explorer entering the temple: " + queue[front]);
            front = (front + 1) % capacity; // Circular increment of front
            size--; // Decrease the size
        }
    }

    // Display the next explorer in line without removing them
    public void nextExplorer() {
        if (isEmpty()) {
            System.out.println("The queue is empty. No explorers in line.");
        } else {
            System.out.println("Next explorer in line: " + queue[front]);
        }
    }

    // Print the entire queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.print("Current queue: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity; // Circular indexing
                System.out.print(queue[index] + " ");
            }
            System.out.println(); // New line after printing the queue
        }
    }
}
