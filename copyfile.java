import java.io.IOException;
import java.nio.file.*;

public class copyfile {
    public static void main(String[] args) {
        try{
            Path source = Paths.get("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\system.txt");
            Path destination = Paths.get("copy_system.txt");
            Files.copy(source,destination,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
