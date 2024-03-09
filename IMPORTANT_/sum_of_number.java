package IMPORTANT_;

import java.util.Scanner;

public class sum_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();//122
        int sum=0;
        while(n>0){
            int rem=n%10;//2
            sum=sum+rem;
            n/=10;
        }
        System.out.println("the sum is: "+sum);
    }
}
