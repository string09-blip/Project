import java.io.FileWriter;
import java.io.IOException;

public class updatefile {
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\system.txt",true);
        writer.write("Hello everyone,\nMy name is Swati Sinha.\nI am from Bihar.\nCurrently I am pursuing bachelor of technology in computer science engineering as my branch from Tecnocrats Institue Of technology.\n");
        writer.close();
        System.out.println("Content Appended successfully.");
    } catch(IOException e){
       System.out.println("An error occurred.");
       e.printStackTrace();
    
    }
    }
}
