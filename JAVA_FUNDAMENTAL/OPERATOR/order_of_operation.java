package JAVA_FUNDAMENTAL.OPERATOR;

import java.util.Scanner;

public class order_of_operation {
    public static void main(String[] args) {
       // System.out.println(5*5*5/5+5+5-5);//B O D M A S rule
//        System.out.println(5/5+3+4*5+5/5);

        //this is the main cause to use loop
        int a=6;
        Scanner anjan=new Scanner(System.in);
        int x1=anjan.nextInt();
        a=a+x1;
        System.out.println(a);
        int X2= anjan.nextInt();
        a=a+X2;
        System.out.println(a);
        int x3= anjan.nextInt();
        a=a+x3;
        System.out.println(a);
    }
}
