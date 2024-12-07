package utils;

import files.FileInfo;

import java.util.ArrayList;
import java.util.List;

public class ChangeDetector {
    private List<FileInfo> snapshot = new ArrayList<>();

    public void commit(List<FileInfo> files) {
        snapshot.clear();
        snapshot.addAll(files);
        System.out.println("Snapshot committed!");
    }

    public void checkChanges(List<FileInfo> files) {
        for (FileInfo file : files) {
            if (!snapshot.contains(file)) {
                System.out.println(file.filename + " has been changed!");
            }
        }
    }
}
