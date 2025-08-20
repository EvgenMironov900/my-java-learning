import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExplorer {
    
    public static void main(String[] args) throws IOException {
        // Указываем начальную директорию для поиска
        Path startDirectory = Paths.get("../Сделать");

        Files.walk(startDirectory)
             .forEach(path -> System.out.println(path));
    }
}

