package Conditional_Statementt;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        if (age<=18 && age>=1){
            System.out.println("CHILDREN");
        } else if (age>=18&&age<=25) {
            System.out.println("Adult");
        }
        else{
            System.out.println("mature person");
        }
    }
}
