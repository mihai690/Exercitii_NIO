import java.nio.file.*;
import java.io.*;

public class Ex21 {
    public static void main (String []args) {
        //afisarea fisierelor > 1000 bytes din folder ul curent
        Path p = Paths.get("./");
        
        try {
            Files.find(p, 10, (x, b) -> b.size() > 1000)
            //find intoarce un stream care respecta conditia
            //si anume ca fisierele sa fie mai mari de 1000 bytes
            //x - path ul
            //b - atributulul path ului
                .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    
    
    }
}
