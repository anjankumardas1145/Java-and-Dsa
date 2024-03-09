package Conditional_Statementt;

import java.util.Scanner;

public class calulatOr {
    public static int Add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int Sub(int c,int d){
        int sub=c-d;
        return sub;
    }
    public static int mul(int e,int f){
        int mul=e*f;
        return mul;
    }
    public static int div(int g,int h){
        int div=g/h;
        return div;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum of the number is"+Add(a,b));
        System.out.println("the substitude of two number is:"+Sub(a,b));
        System.out.println("the multiplication of the number is:"+mul(a,b));
        System.out.println("the division of the number is:"+div(a,b));
    }
}
