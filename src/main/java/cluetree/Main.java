// Author: Basil Moyikkal
// ID: C0908488

package cluetree;

public class Main {
    public static void main(String[] args) {
        // create the binary tree of clues
        ClueTree clueTree = new ClueTree();

        // insert clues into the tree
        clueTree.insert("Hidden Chamber");
        clueTree.insert("Ancient Map");
        clueTree.insert("Golden Idol");
        clueTree.insert("Sacred Stone");
        clueTree.insert("Lost City");

        // perform in-order traversal
        clueTree.inOrderTraversal();

        // perform pre-order traversal
        clueTree.preOrderTraversal();

        // perform post-order traversal
        clueTree.postOrderTraversal();

        // find specific clues
        System.out.println("Finding 'Golden Idol': " + clueTree.findClue("Golden Idol"));
        System.out.println("Finding 'Mysterious Relic': " + clueTree.findClue("Mysterious Relic"));

        // count total clues
        System.out.println("Total clues in the tree: " + clueTree.countClues());
    }
}
