package INSTAGRAM;

import java.util.Scanner;

public class Convert_the_String_into_char_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            System.out.print(ch[i]+" ");
        }
    }
}
