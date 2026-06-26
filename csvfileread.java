import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class csvfileread {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\data.csv");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}