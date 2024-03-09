package IMPORTANT_QUESTION;

import java.util.Scanner;

public class palendrom_number {
    public static void PALEDROME(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        n=temp;
        if (n==sum){
            System.out.println(n+" this is palindrome number.");
        }else{
            System.out.println(n+" not a palindrome number.");
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        PALEDROME(a);
    }
}
