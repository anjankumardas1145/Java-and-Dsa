package IMPORTANT_.String;

import java.util.Scanner;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        str=str.toUpperCase();
        int consonant=0;
        int vowel=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
               if(ch!=' '){
                        if(ch=='A' || ch=='E'|| ch=='I' ||ch=='O' || ch=='U'){
                            vowel++;
                        }else{
                            consonant++;
                        }
               }

        }
        System.out.println("The total number of vowel is : "+vowel+" and consonant is : "+consonant);
    }
}
