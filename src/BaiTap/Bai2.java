package BaiTap;
import java.util.Scanner;


public class Bai2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        if (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println("This is a string: " + input);
        } else {
            System.out.println("Not a string.");
        }
    }
}
