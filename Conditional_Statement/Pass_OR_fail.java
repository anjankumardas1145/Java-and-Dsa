package Conditional_Statement;

import java.util.Scanner;

public class Pass_OR_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks=sc.nextInt();
        String score=(marks>=33)?"pass":"fail";
        System.out.println(score);
        //here i just take one subject mark for understaning but actully you have to put five ar six subject mark to consider a student is pass or fail
    }
}
