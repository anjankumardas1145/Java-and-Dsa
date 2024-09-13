package IMPORTANT_.String;

import java.util.Scanner;

public class MaxOccourChar {
public static char highestOccouringCharacter(String str){
    int [] arr=new int[256];//this is an integer array to store the ascii value of the character
    for(int i=0;i<str.length();i++){
        arr[str.charAt(i)]=arr[str.charAt(i)]+1;
    }
    int max=-1;
    char c= ' ';
    for (int i=0;i<str.length();i++){
        if (max<arr[str.charAt(i)]){
            max=arr[str.charAt(i)];
            c=str.charAt(i);
        }
    }
    return c;
}
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println(highestOccouringCharacter(str));
    }
}
