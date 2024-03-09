package INSTAGRAM;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int min=(a+b-Math.abs(a-b))/2;
        int max=(a+b+Math.abs(a-b))/2;
        System.out.println("the minimum number is:"+min);
        System.out.println("the maximum number is:"+max);
    }
}
