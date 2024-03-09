package FUNCTION;

import java.util.Scanner;

public class isPRIME_NUMBER {
    public static boolean isPRIME(int n){
        boolean isprime=true;//assume number is prime means it has two factor
        for (int i=2;i<=n-1;i++){
            if (n%i==0){//if  another one factor can be find out it will be not a prime number
                isprime=false;
            }
        }
        return isprime;
    }
    //the below function is used for the find the number of prime number inside
    public static void PRIMENUMBER_range(int n){
        for (int i=2;i<=n;i++){
            if (isPRIME(i)==true){
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int a=sc.nextInt();
        PRIMENUMBER_range(a);
        //isPRIME(a);
       // System.out.println(isPRIME(a));
    }
}
