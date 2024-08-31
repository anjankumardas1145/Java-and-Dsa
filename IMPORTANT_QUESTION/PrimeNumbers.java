package IMPORTANT_QUESTION;



    public class PrimeNumbers {
        public static void main(String[] args) {
            int end = 50;

            System.out.println("Prime numbers up to " + end + ":");

            for (int i = 2; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean isPrime(int number) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


