import java.nio.file.*;

public class Ex6 {
    public static void main (String []args) {
       //separarea in partile principale ale path - Root, parent, filename
       Path p1 = Paths.get("C:/A/B/C"); //cale absoluta
       Path p2 = Paths.get("A/B/C"); //cale relativa
       
       System.out.println(p1.getFileName()); //C
       System.out.println(p1.getParent()); // C:/A/B
       System.out.println(p1.getRoot()); // C:/
       
       System.out.println(p2.getFileName()); //C
       System.out.println(p2.getParent());// A/B
       System.out.println(p2.getRoot()); //null - o cale relativa nu are root
    }
}
