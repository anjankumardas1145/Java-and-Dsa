package IMPORTANT_;


    public class SimpleInterest {
        public static void main(String[] args) {
            double principal = 1000; // Principal amount
            double rate = 5;         // Annual interest rate (in percentage)
            int time = 2;            // Time in years

            double interest = (principal * rate * time) / 100;

            System.out.println("Simple Interest: " + interest);
        }
    }


