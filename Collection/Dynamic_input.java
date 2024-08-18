package Collection;


    import java.util.ArrayList;
import java.util.Scanner;

    public class Dynamic_input {
        public static void main(String[] args) {
            // Create an ArrayList to store user inputs
            ArrayList<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            // Loop to take input from the user until they decide to stop
            while (true) {
                System.out.print("Enter an element (or type 'exit' to finish): ");
                String element = scanner.nextLine();

                if (element.equalsIgnoreCase("exit")) {
                    break;
                }

                list.add(element);
            }

            // Print the ArrayList
            System.out.println("ArrayList: " + list);

            // Close the scanner
            scanner.close();
        }
    }


