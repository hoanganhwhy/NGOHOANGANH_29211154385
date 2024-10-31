package Bai1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter birth date (dd/MM/yyyy): ");
        String birthDateStr = scanner.nextLine();

        
        Date birthDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            birthDate = dateFormat.parse(birthDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            return;
        }

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter major: ");
        String major = scanner.nextLine();

        System.out.print("Enter GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter hometown: ");
        String hometown = scanner.nextLine();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birth Date: " + dateFormat.format(birthDate));
        System.out.println("Gender: " + gender);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Hometown: " + hometown);
    }
}
