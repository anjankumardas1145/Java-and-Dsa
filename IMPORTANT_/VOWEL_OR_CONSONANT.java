package IMPORTANT_;

import java.util.Scanner;
public class VOWEL_OR_CONSONANT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the charactrer:");
        char ch=sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("it is a vowel");
                break;
            case 'e':
                System.out.println("it is a vowel");
                break;
            case 'i':
                System.out.println("it is vowel");
                break;
            case 'o':
                System.out.println(" it is a vowel");
                break;
            case 'u':
                System.out.println("it is vowel");
                break;
            default:
                System.out.println("it is a consonant");
        }
    }
}
