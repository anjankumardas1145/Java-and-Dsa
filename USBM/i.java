package USBM;

import java.util.*;

public class i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        while (!sc.hasNextInt()) { // Input validation for age
            System.out.println("Invalid input. Please enter a valid age (integer):");
            sc.next(); // Consume the invalid input
        }
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter the gender:");
        String gender = sc.nextLine();

        if (age <= 5) {
            System.out.println("70%");
        } else if (age <= 8) {
            System.out.println("50%");
        } else if (gender.equalsIgnoreCase("female") && age > 65) {
            System.out.println("70%");
        } else if (gender.equalsIgnoreCase("female")) {
            System.out.println("50%");
        } else if (age > 65) {
            System.out.println("70%");
        } else {
            System.out.println("0%");
        }
    }
}

