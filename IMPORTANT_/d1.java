package IMPORTANT_;
import java.util.Scanner;



    public class d1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a bina");
            String binaryString = scanner.nextLine();
            // Assuming you input "100001"

            long decimalNumber = 0;
            int power = 0;

            for (int i = binaryString.length() - 1; i >= 0; i--) {
                int digit = Character.getNumericValue(binaryString.charAt(i));
                decimalNumber += digit * (2 * power);
                power++;
            }

            System.out.println("Decimal equivalent: " + decimalNumber);
        }
    }

