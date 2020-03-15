import java.nio.file.*;
import java.io.File;

public class Ex11 {
    public static void main (String []args) {
        Path p1 = Paths.get("A/B/C/./../../././X/Y/Z/../../Q/W/./E");
        
        // A/B/C/../../X/Y/Z/../../Q/W/E
        // A/X/Q/W/E
        // intai se elimina ./
        // apoi si ../ - acestea se sterg cu ce este inaintea lor
        
        Path p2 = p1.normalize(); // reduce calea cat mai mult posibil
        
        System.out.println(p2);
        
        File f = p2.toFile(); //transformam Path-ul in instanta de File
        
        Path p3 = f.toPath(); //transf instanta de File in instanta de Path
    }
}
