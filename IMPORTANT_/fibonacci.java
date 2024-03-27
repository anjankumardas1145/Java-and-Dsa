package IMPORTANT_;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series:");
        System.out.println("please enter the number up to which serie  has to be print:");
        int num = sc.nextInt();
        System.out.println("here the fibonacci series ");
        printFibonacci(num);

    }

    public static void printFibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }
    }
}