import java.io.*;
public class Ex3 {
    public static void main (String []args) {
       File file = new File("A/x.txt");
       file.delete(); 
       //delete poate sterge si foldere - acestea treb sa fie fara continut
       //pt a sterge un folder cu continut, trebuie apelat delete in mod recursiv
    }
}
