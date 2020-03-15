import java.nio.file.*;
import java.io.*;

public class Ex12 {
    public static void main (String []args) {
        Path p1 = Paths.get("exempluFile");
        Path p2 = Paths.get("MyFolder");
        
        try {
            Files.createFile(p1);
            Files.createDirectory(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
