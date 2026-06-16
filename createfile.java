import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args){
        try{
            File file = new File ("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\system.txt");
            if(file.createNewFile()){
                System.out.println("File created:" + file.getName());
            }else{
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
