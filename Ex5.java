import java.nio.file.*;

public class Ex5 {
    public static void main (String []args) {
       Path p1 = Paths.get("A/B/C");
       Path p2 = Paths.get("A", "B", "C");
       
       System.out.println(p1.getClass());
       //doar pt a vedea ce clasa este folosita. Nu ne va interesa in practica
       //Java stie in spate sa ne dea fix clasa de care avem nevoie
       //fie ca rulam pe Linux, Mac, Windows...
    }
}
