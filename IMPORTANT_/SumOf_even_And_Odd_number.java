package IMPORTANT_;

import java.util.Scanner;

public class SumOf_even_And_Odd_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int sumEven=0;
        int sumOdd=0;
        while(a>0){
            int digit=a%10;
            if (a%2==0){
                sumEven+=digit;
            }else{
                sumOdd+=digit;
            }
            a/=10;
        }
        System.out.println("the sum of even digit is:"+sumEven);
        System.out.println("the sum of odd digit is:"+sumOdd);
    }
}
