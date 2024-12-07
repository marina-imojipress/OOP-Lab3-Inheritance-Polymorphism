import files.*;
import utils.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FileInfo> files = new ArrayList<>();
        files.add(new TextFile("example.txt", ".txt", LocalDateTime.now(), LocalDateTime.now(), 20, 100));

        ChangeDetector detector = new ChangeDetector();
        detector.commit(files);

        // Simulează modificări
        files.get(0).displayInfo();
        detector.checkChanges(files);
    }
}
