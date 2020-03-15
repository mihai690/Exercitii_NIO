import java.nio.file.*;

public class Ex8 {
    public static void main (String []args) {
       //cu ajutorul lui subpath() obtin doar o parte din calea relativa
       //indexarea incepe de la 0, fara a lua in considerare root-ul
       Path p1 = Paths.get("C:/A/B/C/D/E");
       
       Path sp = p1.subpath(1,3); // B/C
       
       System.out.println(sp); // B/C
    }
}
