package Naveen_Reddy_Java;

import java.util.Scanner;

public class InputAdvCalc extends InputCal {

        public int mul(){
            System.out.println("Enter two number:");
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            return a*b;
        }

        public int div(){
            System.out.println("Enter two number:");
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            return a/b;
        }

        public int mod(){
            System.out.println("Enter two number:");
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            return a%b;
        }
}
