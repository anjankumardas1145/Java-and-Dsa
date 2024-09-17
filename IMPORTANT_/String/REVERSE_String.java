package IMPORTANT_.String;

import java.util.Scanner;

public class REVERSE_String {
    public static String revString(String str){
        String reversed=" ";
        for (int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.nextLine();
        String result=revString(input);
        System.out.println("The reverse of the string is :"+result);

    }
}
