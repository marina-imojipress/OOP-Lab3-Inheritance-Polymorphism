package files;

import java.time.LocalDateTime;

public class FileInfo {
    protected String filename;
    protected String extension;
    protected LocalDateTime creationDate;
    protected LocalDateTime lastModified;

    public FileInfo(String filename, String extension, LocalDateTime creationDate, LocalDateTime lastModified) {
        this.filename = filename;
        this.extension = extension;
        this.creationDate = creationDate;
        this.lastModified = lastModified;
    }

    public void displayInfo() {
        System.out.println("Filename: " + filename);
        System.out.println("Extension: " + extension);
        System.out.println("Created: " + creationDate);
        System.out.println("Last Modified: " + lastModified);
    }
}
