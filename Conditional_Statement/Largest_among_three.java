package Conditional_Statement;

import java.util.Scanner;

public class Largest_among_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
// actual logic
       /* if (a>=b&&a>=c){
            System.out.println(a+"is greatest");
        }else if (b>=c){
            System.out.println(b+"is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }*/
        // MY LOGIC😊

        if (a>b&a>c){
            System.out.println(" a is greatest");
        } else if (b>a&&b>c){

            System.out.println("b is greatest");

        }else{
            System.out.println("  c is greatest");
        }
    }
}
