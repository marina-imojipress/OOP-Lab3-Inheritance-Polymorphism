import utils.ChangeDetector;
import files.FileInfo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de fișiere
        List<FileInfo> files = new ArrayList<>();

        // Adăugăm exemple de fișiere
        files.add(new FileInfo("example.txt", "txt", LocalDateTime.now(), LocalDateTime.now()));
        files.add(new FileInfo("image.png", "png", LocalDateTime.now(), LocalDateTime.now()));

        // Inițializăm ChangeDetector cu lista de fișiere
        ChangeDetector detector = new ChangeDetector(files);

        // Apelăm metoda pentru a verifica schimbările
        detector.checkChanges(files);
    }
}
