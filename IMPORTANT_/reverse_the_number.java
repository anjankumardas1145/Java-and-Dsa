package IMPORTANT_;

import java.util.Scanner;

public class reverse_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println("the reverse is: "+sum);
    }
}
