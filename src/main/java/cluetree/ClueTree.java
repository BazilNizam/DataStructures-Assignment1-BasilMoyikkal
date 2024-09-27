package cluetree;

// Class representing a node in the binary tree
class ClueNode {
    String clue; // The clue stored at the node
    ClueNode left, right; // Left and right children

    // Constructor to initialize a node with a clue
    public ClueNode(String clue) {
        this.clue = clue;
        left = right = null; // No children initially
    }
}

// Binary tree class
public class ClueTree {
    private ClueNode root; // Root of the tree

    // Constructor to initialize an empty tree
    public ClueTree() {
        root = null;
    }

    // Insert a new clue into the binary tree
    public void insert(String clue) {
        root = insertRec(root, clue); // Recursive insertion
    }

    // Recursive method to insert a new clue in the binary tree
    private ClueNode insertRec(ClueNode root, String clue) {
        if (root == null) {
            root = new ClueNode(clue); // Create a new node if the tree is empty
            return root;
        }
        // Decide where to insert based on comparison (simple lexicographical order)
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRec(root.left, clue); // Insert on the left side
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRec(root.right, clue); // Insert on the right side
        }
        return root;
    }

    // In-order traversal (left, root, right)
    public void inOrderTraversal() {
        System.out.print("In-order traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    // Recursive method for in-order traversal
    private void inOrderRec(ClueNode root) {
        if (root != null) {
            inOrderRec(root.left); // Traverse left subtree
            System.out.print(root.clue + " "); // Visit root
            inOrderRec(root.right); // Traverse right subtree
        }
    }

    // Pre-order traversal (root, left, right)
    public void preOrderTraversal() {
        System.out.print("Pre-order traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    // Recursive method for pre-order traversal
    private void preOrderRec(ClueNode root) {
        if (root != null) {
            System.out.print(root.clue + " "); // Visit root
            preOrderRec(root.left); // Traverse left subtree
            preOrderRec(root.right); // Traverse right subtree
        }
    }

    // Post-order traversal (left, right, root)
    public void postOrderTraversal() {
        System.out.print("Post-order traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    // Recursive method for post-order traversal
    private void postOrderRec(ClueNode root) {
        if (root != null) {
            postOrderRec(root.left); // Traverse left subtree
            postOrderRec(root.right); // Traverse right subtree
            System.out.print(root.clue + " "); // Visit root
        }
    }

    // Find a specific clue in the binary tree
    public boolean findClue(String clue) {
        return findClueRec(root, clue);
    }

    // Recursive method to search for a specific clue
    private boolean findClueRec(ClueNode root, String clue) {
        if (root == null) {
            return false; // Clue not found
        }
        if (root.clue.equals(clue)) {
            return true; // Clue found
        }
        // Search left or right subtree depending on comparison
        if (clue.compareTo(root.clue) < 0) {
            return findClueRec(root.left, clue);
        } else {
            return findClueRec(root.right, clue);
        }
    }

    // Count the total number of clues in the binary tree
    public int countClues() {
        return countCluesRec(root);
    }

    // Recursive method to count the nodes
    private int countCluesRec(ClueNode root) {
        if (root == null) {
            return 0; // No clues in an empty subtree
        }
        // Count current node and the nodes in left and right subtrees
        return 1 + countCluesRec(root.left) + countCluesRec(root.right);
    }
}
