package STRING;

import java.util.Scanner;

public class Reverse_of_A_String {
    public static void main(String[] args) {
        System.out.println("enter the string:");
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
        String str="AAA" ;
       int i=0;
       int j=str.length()-1;
       boolean flag=true;// true means palindrome
       while(i<j){
           if (str.charAt(i)!=str.charAt(j)){
               flag=false;
               break;
           }
           i++;j--;
       }
       if (flag==true){
           System.out.println("palindrome");}
           else{
           System.out.println("not palindrome");
           }
       }
    }

