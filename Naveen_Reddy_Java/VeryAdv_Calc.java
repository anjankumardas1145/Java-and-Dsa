package Naveen_Reddy_Java;

import java.util.Scanner;

public class VeryAdv_Calc extends InputAdvCalc {
    public double power(){
        System.out.println("Enter two number for power:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        return Math.pow(a,b);
    }
}
