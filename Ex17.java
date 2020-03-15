import java.util.*;

public class Ex17 {
    public static void main (String []args) {
    //avand o lista de siruri de caractere, afisati dublul valorilor
    //lungimilor sirurilor cu numar par de caractere
    
    List <String> list = Arrays.asList("HELLO", "JOHN");
    
    list.stream() //ne da sursa unui stream
        .filter(s -> s.length() % 2 == 0) //filtrez sirul cu lungime para
        .map(s -> s.length() * 2) //transforma o valoare intr o alta valoare
        .forEach(System.out::println);
    }
}
