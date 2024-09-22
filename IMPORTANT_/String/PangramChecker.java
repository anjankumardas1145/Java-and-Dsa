package IMPORTANT_.String;

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();  // convert to lowercase

        // Array to mark presence of each letter
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter (between 'a' and 'z')
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; // Find the index (0 to 25)
                alphabetPresent[index] = true; // Mark the letter as found
            }
        }

        // Check if all letters (a-z) were marked as present
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabetPresent[i]) {
                isPangram = false;
                break;
            }
        }

        // Output the result
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
