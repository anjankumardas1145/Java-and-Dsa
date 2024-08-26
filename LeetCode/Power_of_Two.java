package LeetCode;

import java.util.Scanner;

public class Power_of_Two {
    public static boolean isPowerOfTwo(int n){
        if(n<=0)
            return false;//multiple of every nymber should be greater then 1 ,i.e positive   number
     int i=1;
     while(i<n){
         i=i*2;
     }
     if(i==n){
         return true;
     }else{
         return false;
     }
    }
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
        System.out.println("Enteer the number:");
        int a= sc.nextInt();

        System.out.println(isPowerOfTwo(a));
    }
}
