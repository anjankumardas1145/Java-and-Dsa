package IMPORTANT_;


import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int first=sc.nextInt();
        System.out.println("enter the second number:");
        int second=sc.nextInt();
        int result=GCD(first,second);
        System.out.println("the result is:"+result);

    }
    public static int GCD(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }



    public static int least(int a,int b){//this function is used to find the least number
        if(a<b){
            return a;
        }else {
            return b;
        }
    }
}
