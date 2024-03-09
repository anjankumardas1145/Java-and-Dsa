package Conditional_Statementt;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("the first number is:");
        int b=sc.nextInt();
        System.out.println("the second number is:");
        int c=sc.nextInt();
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println("the addition of two number is:"+(c+b) );
                break;
            case '-':
                System.out.println("the substraction of the number is:"+(c-b));
                break;
            case '*':
                System.out.println("the multiplication of the number is:"+(c*b));
                break;
            case '/':
                System.out.println("the division of the number is:"+(c/b));
                break;
            case '%':
                System.out.println("the modulus of the number is:"+(c%b));
            default:
                System.out.println("something went wrong");
        }

    }
}
