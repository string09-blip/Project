import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\system.txt");
        if(file.delete()){
            System.out.println("File deleted :" + file.getName());
        }else{
            System.out.println("Failed to delete the file.");
        }

    }
    
}
