import java.nio.file.*;

public class Ex9 {
    public static void main (String []args) {
       //conteaza daca discutam despre cai absolute sau cai relative
       Path p1 = Paths.get("A/B");
       Path p2 = Paths.get("C:/C/D");
       
       Path rez = p1.resolve(p2); //nu f des folosita in practica
       //cat timp calea 2 este relativa,
       //rezultatul va fi o concatenare
       //daca a 2a cale este absoluta, atunci rezultatul este fix a 2a cale
       
       System.out.println(rez);
    }
}
