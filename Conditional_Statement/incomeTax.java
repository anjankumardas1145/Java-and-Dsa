package Conditional_Statement;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the income:");
        int income=sc.nextInt();
        double tax;
        if (income<500000){
            tax=0;
            System.out.println(tax);
        }
        else if (income>500000&&income<1000000){
            tax=(double)income*0.2;
            System.out.println(tax);
        }
        else {
            tax=(double)income*0.3;
            System.out.println(tax);
        }
    }
}
