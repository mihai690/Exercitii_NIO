import java.nio.file.*;
import java.io.*;

public class Ex15 {
    public static void main (String []args) {
        //citire din fisier cu NIO
        Path p = Paths.get("Ex15.java");
        
        try (BufferedReader in = Files.newBufferedReader(p)) {
            String line = null;
            
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
