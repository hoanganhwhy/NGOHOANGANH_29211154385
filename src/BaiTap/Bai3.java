package BaiTap;

import java.util.Scanner;

class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("This is an integer: " + number);
        } else {
            System.out.println("Not an integer.");
        }
    }
}
