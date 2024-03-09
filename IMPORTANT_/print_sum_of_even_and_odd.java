package IMPORTANT_;
public class print_sum_of_even_and_odd {
    public static void main(String[] args) {
        int number = 1234;

        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sumEven += digit; // Add even digits to sumEven
            } else {
                sumOdd += digit; // Add odd digits to sumOdd
            }

            number /= 10; // Move to the next digit
        }

        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);
    }
}
