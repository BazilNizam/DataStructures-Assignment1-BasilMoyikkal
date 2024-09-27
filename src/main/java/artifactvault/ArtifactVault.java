// Author: Basil Moyikkal


package artifactvault;

import java.util.Arrays;

public class ArtifactVault {
    // Instance variables
    private String[] artifacts;
    // Size of the vault (number of artifacts stored)
    private int size;

//      Constructor to initialize the vault with a given capacity
    public ArtifactVault(int capacity) {
        artifacts = new String[capacity];
        size = 0;
    }

    // Method to add an artifact to the vault
    public void addArtifact(String artifact) {
        // Check if the vault is full
        if (size < artifacts.length) {
            artifacts[size++] = artifact; // Add artifact and increment size
        } else {
            System.out.println("Vault is full! Cannot add more artifacts.");
        }
    }

    // Method to remove an artifact from the vault
    public boolean removeArtifact(String artifact) {
        //  Iterate through the artifacts array
        for (int i = 0; i < size; i++) {
            // Check if the artifact is found
            if (artifacts[i].equals(artifact)) {
                artifacts[i] = artifacts[size - 1]; // Replace with last artifact
                artifacts[size - 1] = null; // Remove last artifact
                size--; // Decrement size
                return true; // Indicate successful removal
            }
        }
        return false; // Artifact not found
    }

    // Method to find an artifact using linear search
    public int findArtifactLinear(String artifact) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(artifact)) {
                return i; // Return index if found
            }
        }
        return -1; // Artifact not found
    }

    // Method to find an artifact using binary search
    public int findArtifactBinary(String artifact) {
        Arrays.sort(artifacts, 0, size); // Ensure the array is sorted for binary search
        int left = 0, right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (artifacts[mid].equals(artifact)) {
                return mid; // Return index if found
            } else if (artifacts[mid].compareTo(artifact) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Artifact not found
    }
}
