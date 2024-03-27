package IMPORTANT_;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        boolean ans=isPrime(num);
        if (ans){
            System.out.println("your number is prime");
        }else {
            System.out.println("the number is not prime");
        }

    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
