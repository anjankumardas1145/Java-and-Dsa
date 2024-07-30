package Naveen_Reddy_Java;

import java.util.Scanner;

public class InputCal {
    public int add(){
        System.out.println("Enter two number for sum:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        return a+b;
    }

        public int sub(){
            System.out.println("Enter two number for substraction:");
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            return a-b;
        }
}
