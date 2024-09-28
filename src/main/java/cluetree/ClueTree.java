// Author: Basil Moyikkal
// ID: C0908488

package cluetree;

// class representing a node in the binary tree
class ClueNode {
    String clue; // the clue stored at the node
    ClueNode left, right; // left and right children

    // constructor to initialize a node with a clue
    public ClueNode(String clue) {
        this.clue = clue;
        // no children initially
        left = right = null;
    }
}

// binary tree class
public class ClueTree {
    private ClueNode root; // root of the tree

    // constructor to initialize an empty tree
    public ClueTree() {
        // tree is empty
        root = null;
    }

    // insert a new clue into the binary tree
    public void insert(String clue) {
        // recursive insertion
        root = insertRec(root, clue);
    }

    // recursive method to insert a new clue in the binary tree
    private ClueNode insertRec(ClueNode root, String clue) {
        if (root == null) {
            // create a new node if the tree is empty
            root = new ClueNode(clue);
            return root;
        }
        // decide where to insert based on comparison
        if (clue.compareTo(root.clue) < 0) {
            // insert on the left side
            root.left = insertRec(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            // insert on the right side
            root.right = insertRec(root.right, clue);
        }
        return root;
    }

    // in-order traversal (left, root, right)
    public void inOrderTraversal() {
        System.out.print("in-order traversal: ");
        // call recursive method
        inOrderRec(root);
        System.out.println();
    }

    // recursive method for in-order traversal
    private void inOrderRec(ClueNode root) {
        if (root != null) {
            // traverse left subtree
            inOrderRec(root.left);
            // visit root
            System.out.print(root.clue + " ");
            // traverse right subtree
            inOrderRec(root.right);
        }
    }

    // pre-order traversal (root, left, right)
    public void preOrderTraversal() {
        System.out.print("pre-order traversal: ");
        // call recursive method
        preOrderRec(root);
        System.out.println();
    }

    // recursive method for pre-order traversal
    private void preOrderRec(ClueNode root) {
        if (root != null) {
            // visit root
            System.out.print(root.clue + " ");
            // traverse left subtree
            preOrderRec(root.left);
            // traverse right subtree
            preOrderRec(root.right);
        }
    }

    // post-order traversal (left, right, root)
    public void postOrderTraversal() {
        System.out.print("post-order traversal: ");
        // call recursive method
        postOrderRec(root);
        System.out.println();
    }

    // recursive method for post-order traversal
    private void postOrderRec(ClueNode root) {
        if (root != null) {
            // traverse left subtree
            postOrderRec(root.left);
            // traverse right subtree
            postOrderRec(root.right);
            // visit root
            System.out.print(root.clue + " ");
        }
    }

    // find a specific clue in the binary tree
    public boolean findClue(String clue) {
        // call recursive method
        return findClueRec(root, clue);
    }

    // recursive method to search for a specific clue
    private boolean findClueRec(ClueNode root, String clue) {
        if (root == null) {
            return false; // clue not found
        }
        if (root.clue.equals(clue)) {
            return true; // clue found
        }
        // search left or right subtree depending on comparison
        if (clue.compareTo(root.clue) < 0) {
            return findClueRec(root.left, clue);
        } else {
            return findClueRec(root.right, clue);
        }
    }

    // count the total number of clues in the binary tree
    public int countClues() {
        // call recursive method
        return countCluesRec(root);
    }

    // recursive method to count the nodes
    private int countCluesRec(ClueNode root) {
        if (root == null) {
            return 0; // no clues in an empty subtree
        }
        // count current node and the nodes in left and right subtrees
        return 1 + countCluesRec(root.left) + countCluesRec(root.right);
    }
}
