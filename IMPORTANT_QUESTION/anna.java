package IMPORTANT_QUESTION;

public class anna {



        // Function to add two numbers using recursion
        public static int add(int a, int b) {
            // Base case: if b is zero, return a
            if (b == 0) {
                return a;
            }

            // Recursive step: increment a by 1 and decrement b by 1
            return add(a + 1, b - 1);
        }

        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 3;

            // Call the recursive add function
            int result = add(num1, num2);

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        }
    }



