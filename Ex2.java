import java.io.*;
public class Ex2 {
    public static void main (String []args) {
        File file = new File("A/x.txt"); 
        //pun in folderul A un fisier de tip .txt
        try {
        file.createNewFile();
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }
}
