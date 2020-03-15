import java.util.*;

public class Ex18 {
    public static void main (String []args) {
    //avand o lista de nr intregi, afisati suma nr impare
    
    List <Integer> list = Arrays.asList(2,3,4,5,6,7);
    
    int suma = list.stream() //ne da sursa unui stream
        .filter(x -> x % 2 == 1) //filtrez valorile impare
        .reduce(0, (a,b)-> a+b);
        //primeste o valoare initiala - 0 aici
        // si operatia pe care o aplica intre valori
        //incepe de la 0 si face suma tuturor valorilor impare
        
        System.out.println(suma); //15
    }
}
