package file_reader;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader {
    public void readFile(){
        ClassLoader cl = getClass().getClassLoader();
        File file = new File(cl.getResource("file_reader/textForFileReader.txt").getFile());
        Path path = Paths.get(file.getPath());
        try {
            Stream<String> linesOfTextFromFile = Files.lines(path);
        } catch (IOException e) {
                System.out.println("Required file not found. Check path to file.");
        }
    }
}
