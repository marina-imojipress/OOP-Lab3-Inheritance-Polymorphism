package files;

import java.time.LocalDateTime;

public class TextFile extends FileInfo {
    private int lineCount;
    private int wordCount;

    public TextFile(String filename, String extension, LocalDateTime creationDate, LocalDateTime lastModified, int lineCount, int wordCount) {
        super(filename, extension, creationDate, lastModified);
        this.lineCount = lineCount;
        this.wordCount = wordCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
    }
}
