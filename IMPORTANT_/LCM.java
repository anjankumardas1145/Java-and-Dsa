package IMPORTANT_;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int first=sc.nextInt();
        System.out.println("enter the second number:");
        int second=sc.nextInt();

        int result=LCM(first,second);
        System.out.println("the LCM of the two number is:"+result);

    }
    public static int LCM(int  first,int second){
        int i=1;
        while(i<=second){
            int factor=first*i;
            if (factor%second==0){
                return factor;
            }
            i++;
        }
        return 0;//unreachable
    }
}
