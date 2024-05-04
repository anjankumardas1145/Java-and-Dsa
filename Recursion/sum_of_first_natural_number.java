package Recursion;

public class sum_of_first_natural_number {
    public static int  calsum(int n){
        if(n==1){
            return 1;
        }
        int sm1=calsum(n-1);
        int sn=n+sm1;
        return sn;

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println( " the sum of first " +
                + n+" natural number is "+ calsum(n));
    }
}
