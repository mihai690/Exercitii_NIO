import java.io.*;
public class Ex4 {
    public static void main (String []args) {
        
        try (InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr)
            ) {
            while (true) {
            System.out.print("Comanda:");
            String cmd = cons.readLine();
            
            String [] cuv = cmd.split("\\s+"); //imparte in cuvinte o propozitie 
            
            switch (cuv[0]) {
            case "exit" : {
                System.out.println("exiting...");
                return;
            }
            case "cf": {
                File file = new File (cuv[1]);
                file.createNewFile();
                System.out.println("A fost creat un fisier");
            } break;
            
            case "cd": {
                File file = new File (cuv[1]);
                file.mkdir();
                System.out.println("A fost creat un folder");
            } break;
            case "delete": {
                File file = new File (cuv[1]);
                file.delete();
                System.out.println("A fost sters un fisier");
            } break;
            
            case "list": {
                File file = new File(cuv[1]);
                String [] fisiere = file.list(); 
                //list() ne da sub forma de String numele fisierelor
                //listFiles() ne da sub forma de instante de File fisierele
                for (String n : fisiere) {
                    System.out.println(n);
                } break;
            }
            
            default:
                System.out.println("Cda inexistenta...");
            }
        }
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }
}