import java.nio.file.*;

public class Ex10 {
    public static void main (String []args) {
    //conteaza daca discutam despre cai absolute sau cai relative
       Path p1 = Paths.get("A/B/C/D");
       Path p2 = Paths.get("A/B/X/Y");
       
       Path rez = p1.relativize(p2); //cum ajungem din D in Y ?
       // ne intoarcem de 2 ori pana ajungem in B, apoi mergem in X si apoi in Y
       //daca dam o cale abs si una relativa, vom avea IllegalArgumentException
       //caile trebuie sa fie de acelasi tip
       
       System.out.println(rez);    
    }
}
