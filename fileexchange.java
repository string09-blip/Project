import java.io.*;
import java.util.*;

public class fileexchange {
    public static void main(String[] args) {
        try {
            File input = new File("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\info.txt");
            Scanner sc = new Scanner(input);

            FileWriter writer = new FileWriter("C:\\Users\\sw459\\OneDrive\\Desktop\\java practice\\info.csv");

            while (sc.hasNextLine()) {
                writer.write(sc.nextLine() + "\n");
            }

            sc.close();
            writer.close();

            System.out.println("TXT file converted to CSV successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}