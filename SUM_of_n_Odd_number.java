import java.util.Scanner;

public class SUM_of_n_Odd_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i=i+2){
            sum=sum+i;

        }
        System.out.println("the sum is:"+sum);
    }
}
