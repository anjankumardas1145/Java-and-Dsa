package Collection;



    import java.util.ArrayList;
import java.util.Scanner;

    public class Integer_Dynamic_Input {
        public static void main(String[] args) {
            // Create an ArrayList to store user inputs
            ArrayList<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            String input;

            // Loop to take input from the user until they decide to stop
            System.out.print("Enter an integer (or type 'exit' to finish): ");
            input = scanner.nextLine();

            while (!input.equalsIgnoreCase("exit")) {
                try {
                    int number = Integer.parseInt(input);
                    list.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }

                System.out.print("Enter an integer (or type 'exit' to finish): ");
                input = scanner.nextLine();
            }

            // Print the ArrayList
            System.out.println("ArrayList: " + list);

            // Close the scanner
            scanner.close();
        }
    }


