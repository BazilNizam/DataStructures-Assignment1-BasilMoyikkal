package artifactvault;

public class Main {
    public static void main(String[] args) {
        // create an instance of ArtifactVault with a capacity of 5
        ArtifactVault vault = new ArtifactVault(5);

        // adding artifacts to the vault
        vault.addArtifact("Golden Idol");
        vault.addArtifact("Ancient Scroll");
        vault.addArtifact("Sacred Amulet");

        // display the result of finding an artifact using linear search
        System.out.println("finding 'Ancient Scroll' at index: " + vault.findArtifactLinear("Ancient Scroll"));

        // attempting to remove an artifact
        boolean removed = vault.removeArtifact("Golden Idol");
        // check if 'Golden Idol' was removed
        System.out.println("was 'Golden Idol' removed? " + removed);

        // trying to find the removed artifact
        System.out.println("finding 'Golden Idol' at index: " + vault.findArtifactLinear("Golden Idol"));
    }
}
