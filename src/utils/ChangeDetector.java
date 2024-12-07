package utils;

import files.FileInfo;
import java.util.List;

public class ChangeDetector {
    private List<FileInfo> files;

    // Constructor care primește lista de fișiere
    public ChangeDetector(List<FileInfo> files) {
        this.files = files;
    }

    // Metodă pentru a verifica schimbările
    public void checkChanges(List<FileInfo> files) {
        System.out.println("Checking for changes in files...");
        for (FileInfo file : files) {
            // Exemplu de verificare
            System.out.println(file.getFilename() + " has been checked for changes.");
        }
    }
}
