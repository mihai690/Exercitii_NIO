import java.nio.file.*;
import java.io.*;
import java.util.*; //pt List

public class Ex16 {
    public static void main (String []args) {
        //alternativa la ex anterior - nu se recom pt fisiere foarte mari
        //putem ajunge la OutOfMemoryError
        Path p1 = Paths.get("Ex16.java");
                
        try {
            List <String> lines = Files.readAllLines(p1); 
            //readAllLines() citeste dintr o lista sirul,
            //ceea ce inseamna ca pastram referinta catre toate sirurile
            //de aceea este recomandata doar pt fisiere mici
            lines.forEach(System.out::println);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
