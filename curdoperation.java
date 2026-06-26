import java.util.Scanner;

public class curdoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        // CREATE
        arr[0] = "Apple";
        arr[1] = "Banana";

        // READ
        System.out.println("Array Elements:");
        for (String item : arr) {
            if (item != null)
                System.out.println(item);
        }

        // UPDATE
        arr[1] = "Mango";
        System.out.println("\nAfter Update:");
        for (String item : arr) {
            if (item != null)
                System.out.println(item);
        }

        // DELETE
        arr[0] = null;
        System.out.println("\nAfter Delete:");
        for (String item : arr) {
            if (item != null)
                System.out.println(item);
        }

        sc.close();
    }
}