package files;

import java.time.LocalDateTime;

public class ImageFile extends FileInfo {
    private int width;
    private int height;

    public ImageFile(String filename, String extension, LocalDateTime creationDate, LocalDateTime lastModified, int width, int height) {
        super(filename, extension, creationDate, lastModified);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dimensions: " + width + "x" + height);
    }
}
