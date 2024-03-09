package IMPORTANT_;

import java.util.Scanner;

public class Count_the_number_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            count ++;
            n/=10;
        }
        System.out.println("the number of digit in "+n+" is:"+count);
    }
}
