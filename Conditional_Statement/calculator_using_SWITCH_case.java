package Conditional_Statement;

import java.util.Scanner;

public class calculator_using_SWITCH_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        System.out.println("entert the operator:");
        char ch=sc.next().charAt(0);
        switch (ch){
            case'+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Something went wrong:");
        }

    }
}
