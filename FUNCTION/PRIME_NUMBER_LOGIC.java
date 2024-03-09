package FUNCTION;

public class PRIME_NUMBER_LOGIC {
    public static void ISprime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

            if (count == 2) {
                System.out.println(+n+"  is a prime number");
            } else {
                System.out.println("not");
            }

        }
    public static void main(String[] args) {

        ISprime(4);
    }

}
