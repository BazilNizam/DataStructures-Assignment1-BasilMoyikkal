package cluetree;

public class Main {
    public static void main(String[] args) {
        // Create the binary tree of clues
        ClueTree clueTree = new ClueTree();

        // Insert clues into the tree
        clueTree.insert("Hidden Chamber");
        clueTree.insert("Ancient Map");
        clueTree.insert("Golden Idol");
        clueTree.insert("Sacred Stone");
        clueTree.insert("Lost City");

        // Perform in-order traversal
        clueTree.inOrderTraversal();

        // Perform pre-order traversal
        clueTree.preOrderTraversal();

        // Perform post-order traversal
        clueTree.postOrderTraversal();

        // Find specific clues
        System.out.println("Finding 'Golden Idol': " + clueTree.findClue("Golden Idol"));
        System.out.println("Finding 'Mysterious Relic': " + clueTree.findClue("Mysterious Relic"));

        // Count total clues
        System.out.println("Total clues in the tree: " + clueTree.countClues());
    }
}
