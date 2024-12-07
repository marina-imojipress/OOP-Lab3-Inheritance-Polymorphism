package files;

import java.time.LocalDateTime;

public class ProgramFile extends FileInfo {
    private int classCount;
    private int methodCount;

    public ProgramFile(String filename, String extension, LocalDateTime creationDate, LocalDateTime lastModified, int classCount, int methodCount) {
        super(filename, extension, creationDate, lastModified);
        this.classCount = classCount;
        this.methodCount = methodCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Classes: " + classCount);
        System.out.println("Methods: " + methodCount);
    }
}
