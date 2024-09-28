# 🌟 Data Structures Adventure - Assignment 1 🌟

<div style="border: 1px solid white; padding: 10px; border-radius: 10px; background-color: rgba(0, 0, 0, 0.7); color: white; backdrop-filter: blur(10px);">

## 🧑‍🎓 **Student Details:**
- **Name**: **Basil Moyikkal**
- **Student ID**: **C0908488**

</div>

---

## 📜 **Overview:**
This assignment consists of 5 coding challenges, each designed to test and explore fundamental data structures. Here's a breakdown of each challenge, how I approached it, the assumptions I made, and instructions for running the code.

---

<div style="border: 1px solid white; padding: 10px; border-radius: 10px; background-color: rgba(0, 0, 0, 0.7); color: white; backdrop-filter: blur(10px);">

### 1️⃣ The Array Artifact 🏺 (`artifactvault` Package)

**Description**:  
I developed the `ArtifactVault` class to store ancient artifacts in an array. This challenge required me to implement both linear and binary search while keeping the array sorted for the binary search function.

**Approach**:  
I created an array with methods to:
- Add artifacts sequentially.
- Remove artifacts by their name.
- Perform a linear search across all elements.
- Perform a binary search on a sorted array, ensuring better performance when looking for specific artifacts.

**Assumptions**:
- The array size is fixed.
- The array is pre-sorted based on artifact age to allow binary search.

**Design Decisions**:
- I chose an array as the data structure for its simplicity and direct access to elements. The trade-off was the fixed size and need for manual resizing if extended.

#### 🚀 How to Run:
1. Open the `artifactvault` package.
2. Run the `Main` class to see the array operations in action.

</div>

---

<div style="border: 1px solid white; padding: 10px; border-radius: 10px; background-color: rgba(0, 0, 0, 0.7); color: white; backdrop-filter: blur(10px);">

### 2️⃣ The Linked List Labyrinth 🌀 (`labyrinthpath` Package)

**Description**:  
In this challenge, I built a `LabyrinthPath` class using a **singly linked list** to model a path in a labyrinth. The goal was to add new locations, remove the last visited one, detect loops (traps), and print the entire path.

**Approach**:  
I created a node-based linked list where:
- Each node represents a location.
- New locations can be added.
- The last visited location can be removed (similar to backtracking).
- A loop detection algorithm (Floyd’s Cycle-Finding Algorithm) identifies traps.

**Assumptions**:
- Each location is unique, so no duplicates are allowed.
- The list is singly linked for simplicity.

**Design Decisions**:
- Using a linked list allowed me to easily add and remove locations without needing to shift elements, which would have been more complex in an array.

#### 🚀 How to Run:
1. Open the `labyrinthpath` package.
2. Run the `Main` class to simulate moving through the labyrinth, checking for loops, and printing the path.

</div>

---

<div style="border: 1px solid white; padding: 10px; border-radius: 10px; background-color: rgba(0, 0, 0, 0.7); color: white; backdrop-filter: blur(10px);">

### 3️⃣ The Stack of Ancient Texts 📚 (`scrollstack` Package)

**Description**:  
The `ScrollStack` class manages a stack of scrolls using the **LIFO** (Last-In-First-Out) structure. I implemented basic stack operations like push, pop, peek, and search for a scroll by title.

**Approach**:  
I created a class that:
- Pushes new scrolls onto the stack.
- Pops the most recently added scroll off the stack.
- Allows peeking at the top scroll without removing it.
- Searches through the stack for a scroll title.

**Assumptions**:
- The stack is limited to a reasonable number of scrolls (no infinite stack size).

**Design Decisions**:
- A stack was perfect for this scenario since ancient texts are often accessed in reverse order (i.e., the last added scroll is the first accessed).

#### 🚀 How to Run:
1. Open the `scrollstack` package.
2. Run the `Main` class to push, pop, and search for scrolls in the stack.

</div>

---

<div style="border: 1px solid white; padding: 10px; border-radius: 10px; background-color: rgba(0, 0, 0, 0.7); color: white; backdrop-filter: blur(10px);">

### 4️⃣ The Queue of Explorers 🏃‍♂️🏃‍♀️ (`explorerqueue` Package)

**Description**:  
For this challenge, I implemented the `ExplorerQueue` class using a **circular queue** to manage explorers waiting to enter a temple. This data structure supports enqueue, dequeue, peek, and checks for full or empty states.

**Approach**:  
I created a circular queue that:
- Enqueues explorers as they arrive.
- Dequeues explorers when they enter the temple.
- Peeks at the next explorer in line.
- Checks whether the queue is full or empty.

**Assumptions**:
- The number of explorers is bounded by the queue’s capacity.

**Design Decisions**:
- The circular queue optimizes memory usage and avoids wasted space when explorers are dequeued.

#### 🚀 How to Run:
1. Open the `explorerqueue` package.
2. Run the `Main` class to simulate explorers entering the temple in a queue.

</div>

---

<div style="border: 1px solid white; padding: 10px; border-radius: 10px; background-color: rgba(0, 0, 0, 0.7); color: white; backdrop-filter: blur(10px);">

### 5️⃣ The Binary Tree of Clues 🌳 (`cluetree` Package)

**Description**:  
The `ClueTree` class models a binary tree where each node contains a clue. This challenge tested my ability to implement basic binary tree operations, such as insertion, traversal (in-order, pre-order, post-order), searching, and counting nodes.

**Approach**:  
I designed a binary tree where:
- New clues are inserted.
- Traversals (in-order, pre-order, and post-order) reveal clues in different sequences.
- Specific clues can be searched for.
- The total number of clues is counted.

**Assumptions**:
- The tree is not self-balancing, meaning performance could degrade if the tree becomes unbalanced.

**Design Decisions**:
- I opted for a simple binary tree rather than a balanced tree to keep the implementation straightforward.

#### 🚀 How to Run:
1. Open the `cluetree` package.
2. Run the `Main` class to manage the binary tree of clues and perform operations like insertion and traversal.

</div>

---

## 🛠 How to Run the Entire Project:
1. **Clone** this repository to your local machine:
   ```bash
   git clone https://github.com/BazilNizam/DataStructures-Assignment1-BasilMoyikkal
