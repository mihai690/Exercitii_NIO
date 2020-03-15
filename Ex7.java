import java.nio.file.*;

public class Ex7 {
    public static void main (String []args) {
       //parcurgerea fiecarui nivel din Path cu getName() si getNameCount()
       Path p1 = Paths.get("C:/A/B/C/D/E");
       
       for (int i = 0; i<p1.getNameCount(); i++) {
           System.out.println(p1.getName(i));
           //root-ul nu este luat in considerare
           //se incepe de la 0, iar in cazul nostru este A
        }
    }
}
