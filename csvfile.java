import java.io.File;
import java.io.IOException;

public class csvfile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\data.csv");

            if (file.createNewFile()) {
                System.out.println("CSV file created: " + file.getName());
            } else {
                System.out.println("CSV file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}