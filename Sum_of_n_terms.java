import java.util.Scanner;

public class Sum_of_n_terms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int avg=0;
        for (int i=1;i<=n;i++){
           System.out.println("the natural numbers are:"+i);
            sum=sum+i;
            avg=sum/n;
        }
        System.out.println("the sum is:"+sum);
        System.out.println("the avg of the number is:"+avg);
    }
}
