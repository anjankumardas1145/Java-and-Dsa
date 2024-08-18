package Collection;


    import java.util.ArrayList;
    import java.util.Scanner;

    public class ArraListInput{
        public static void main(String[] args) {
            // Create an ArrayList to store user inputs
            ArrayList<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the number of elements
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
           scanner.nextLine(); // Consume the newline character

            // Loop to take input from the user
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                String element = scanner.nextLine();
                list.add(element);
            }

            //display the content of arraylist
            System.out.println("ArrayList: " + list);

            // Close the scanner

        }
    }


