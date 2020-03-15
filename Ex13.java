import java.nio.file.*;
import java.io.*;

public class Ex13 {
    public static void main (String []args) {
        Path p1 = Paths.get("MyFolder");
        
        try {
        if (Files.exists(p1)) {
            Files.delete(p1);
        }
        // sau puteam scrie doar Files.deleteIfExista(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
