package IMPORTANT_.String;

import java.util.Scanner;
public class Palindrome_String {
    public static void revString(String str){
        String temp=str;
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){

            reversed=reversed+str.charAt(i);
        }
        if(reversed.equals(temp)){
            System.out.println(" this is a palindrome string");
        }else{
            System.out.println("not a palindrome");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.nextLine();
revString(input);
//        System.out.println("The reverse of the string is :"+result);

    }
}
