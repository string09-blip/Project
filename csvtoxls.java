import java.io.*;
import java.util.*;

public class csvtoxls {
    public static void main(String[] args) {
        try {
            File input = new File("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\info.csv");
            Scanner sc = new Scanner(input);

            FileWriter writer = new FileWriter("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\info.xls");

            while (sc.hasNextLine()) {
                writer.write(sc.nextLine() + "\n");
            }

            sc.close();
            writer.close();

            System.out.println("CSV file converted to XLS successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}