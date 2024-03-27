package LOOP;

import java.util.Scanner;

public class takeINPUT {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number:");
            int input=sc.nextInt();
            System.out.println("the number is:"+input);
            i++;
        }
    }
}
