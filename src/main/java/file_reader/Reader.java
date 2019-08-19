package file_reader;


import java.io.File;

public class Reader {
    public void readFile(){
        ClassLoader cl = getClass().getClassLoader();
        File file = new File(cl.getResource("file_reader/textForFileReader.txt").getFile());
    }
}
