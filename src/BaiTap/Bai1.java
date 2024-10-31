package BaiTap;
import java.util.Scanner;

public class Bai1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter gender: ");
        
        String gender = scanner.next();

        System.out.print("Enter major: ");
        
        String major = scanner.next();
        
        System.out.print("Enter GPA: ");
        
        float gpa = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter hometown: ");
        
        String hometown = scanner.nextLine();

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Hometown: " + hometown);
   }   
}
