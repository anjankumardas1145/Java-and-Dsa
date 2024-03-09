package IMPORTANT_;

import java.util.Scanner;

public class decimal_BINARY {
    public static int decTObin(int n){
        int pow=0;
        int binary=0;
        while (n>0){
            int rem=n%2;
            binary=binary+(rem*(int)Math.pow(10,pow));//logic for decimal to binary
            pow++;
            n/=2;//to reduce the number
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number:");
        int a=sc.nextInt();
        System.out.println(decTObin(a));
    }
}
