// Author: Basil Moyikkal


package artifactvault;

import java.util.Arrays;

public class ArtifactVault {
    // this is where we keep our stuff
    private String[] artifacts;
    // this is how many things we have in the vault
    private int size;

    // this makes the vault with a certain size
    public ArtifactVault(int capacity) {
        // we create an empty space for artifacts
        artifacts = new String[capacity];
        // we start with zero things in the vault
        size = 0;
    }

    // this adds a new thing to the vault
    public void addArtifact(String artifact) {
        // check if we have room for more stuff
        if (size < artifacts.length) {
            // we put the new thing in and count it
            artifacts[size++] = artifact;
        } else {
            // we can't add more stuff
            System.out.println("vault is full! cannot add more artifacts.");
        }
    }

    // this takes away a thing from the vault
    public boolean removeArtifact(String artifact) {
        // go through all the things in the vault
        for (int i = 0; i < size; i++) {
            // if we find the thing we want to remove
            if (artifacts[i].equals(artifact)) {
                // swap with the last thing
                artifacts[i] = artifacts[size - 1];
                // remove the last thing
                artifacts[size - 1] = null;
                // we have one less thing now
                size--;
                // return true after removing
                return true;
            }
        }
        // return -1, dint find
        return false;
    }

    // this looks for a thing in the vault one by one
    public int findArtifactLinear(String artifact) {
        // go through all the things in the vault
        for (int i = 0; i < size; i++) {
            // we found it! return the spot
            if (artifacts[i].equals(artifact)) {
                return i;
            }
        }
        // return -1, dint find
        return -1;
    }

    // this looks for a thing in the vault fast if it's sorted
    public int findArtifactBinary(String artifact) {
        // make sure our stuff is in order
        Arrays.sort(artifacts, 0, size);
        int left = 0, right = size - 1;

        // keep looking while there's stuff to check
        while (left <= right) {
            // find the middle thing
            int mid = left + (right - left) / 2;
            // we found it! return the spot
            if (artifacts[mid].equals(artifact)) {
                return mid;
            } else if (artifacts[mid].compareTo(artifact) < 0) {
                // look on the right side
                left = mid + 1;
            } else {
                // look on the left side
                right = mid - 1;
            }
        }
        // return -1, dint find
        return -1;
    }
}
