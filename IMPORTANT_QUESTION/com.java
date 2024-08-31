package IMPORTANT_QUESTION;
import java.util.Scanner;
public class com {
        // Function to check if a number is composite
        public static boolean isComposite(int num) {
            if (num <= 1) {
                return false; // Composite numbers are greater than 1
            }

            // Check for factors other than 1 and itself
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return true; // Found a factor, so it's composite
                }
            }

            return false; // No factors found, so it's not composite
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to check if it's composite: ");
            int number = scanner.nextInt();

            if (isComposite(number)) {
                System.out.println(number + " is a composite number.");
            } else {
                System.out.println(number + " is not a composite number.");
            }

            scanner.close();
        }
    }


