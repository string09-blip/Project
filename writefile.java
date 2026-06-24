import java.io.FileWriter;
import java.io.IOException;

public class writefile {
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\system.txt");
            writer.write("Hii, I am Swati Sinha. How's your day today.\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
