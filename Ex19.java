import java.nio.file.*;
import java.io.*;

public class Ex19 {
    public static void main (String []args) {
    //idem Ex15 - citire din fisier cu NIO
    //aici facem totul cu o sg linie de cod insa
        Path p = Paths.get("Ex19.java");
        try {
        Files.lines(p)
            .filter(s -> !s.trim().isEmpty()) //elimin complet liniile goale
            .filter(s -> s.length() % 2 == 0) //afisez doar liniile pare
            .map(s-> new StringBuilder(s).reverse()) //afisez liniile de la dr la st
            .forEach(System.out::println); 
        //returneaza un stream cu liniile din fisierul de la path-ul p
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    }
}
