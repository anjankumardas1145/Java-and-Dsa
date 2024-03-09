package INSTAGRAM;

import java.util.Scanner;

public class P3 {
  //P3  //without using division operator find the reminder and quetient

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        System.out.println("enter anothe number:");
        int b=sc.nextInt();
        int quet=0;
        while(a>=b){
            a=a-b;
            quet++;

        }
        System.out.println("quesent is "+quet+"\n reminder is "+a);
    }
}
