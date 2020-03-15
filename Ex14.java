import java.nio.file.*;
import java.io.*;

public class Ex14 {
    public static void main (String []args) {
        Path p1 = Paths.get("Ex14.java");
        Path p2 = Paths.get("alt_path.txt");
        
        try {
         
            Files.copy(p1,p2);
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
