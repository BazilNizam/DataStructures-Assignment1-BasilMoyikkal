package artifactvault;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ArtifactVault with a capacity of 5
        ArtifactVault vault = new ArtifactVault(5);

        // Adding artifacts to the vault
        vault.addArtifact("Golden Idol");
        vault.addArtifact("Ancient Scroll");
        vault.addArtifact("Sacred Amulet");

        // Display the result of finding an artifact using linear search
        System.out.println("Finding 'Ancient Scroll' at index: " + vault.findArtifactLinear("Ancient Scroll"));

        // Attempting to remove an artifact
        boolean removed = vault.removeArtifact("Golden Idol");
        System.out.println("Was 'Golden Idol' removed? " + removed);

        // Trying to find the removed artifact
        System.out.println("Finding 'Golden Idol' at index: " + vault.findArtifactLinear("Golden Idol"));
    }
}
