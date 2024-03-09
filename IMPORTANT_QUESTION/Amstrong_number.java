package IMPORTANT_QUESTION;

import java.util.Scanner;

public class Amstrong_number {
    public static void AMSTRONG(int n){
        int count=0;
        int temp=n;
        while (temp>0){
            temp/=10;
            count++;//4

        }
        temp=n;
        int ans=0;
        while(temp>0){
            int rem=temp%10;
             ans=ans+(int)Math.pow(rem,count);
             temp/=10;
        }
        if (n==ans){
            System.out.println(n+"  is an amstring number");
        }else{
            System.out.println(n+" is not an amstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        AMSTRONG(a);
    }
}
