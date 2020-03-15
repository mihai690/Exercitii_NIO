import java.nio.file.*;
import java.io.*;

public class Ex20 {
    public static void main (String []args) {
    //afiseaza in consola continutul folder-ului
    //prin "./" ne referim la folder ul curent
        Path p = Paths.get("./");
        try {
            //Files.list(p) sau:
            Files.walk(p, 10)
            //e aprox la fel ca list, doar ca:
            //list ia doar ce este in folder ul curent
            //walk se duce si in folderele continute cat dorim
            //aici - 10 niveluri
            .filter(x -> x.toString().endsWith(".java")) 
            //afiseaza doar pe cele.java
            .filter(x-> x.getFileName().toString().length() % 2 == 0)
            //afiseaza doar pe cele nu nr par de caractere
            .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}
