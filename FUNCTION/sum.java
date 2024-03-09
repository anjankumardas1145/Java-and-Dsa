package FUNCTION;

import java.util.Scanner;

public class sum {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        calculateSum(a,b);
        int result=calculateSum(a,b);
        System.out.println("the sum of the given number is:"+result);
    }
}
