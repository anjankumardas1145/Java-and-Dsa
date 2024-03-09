package FUNCTION;

import java.util.Scanner;

public class fActorial_Of_A_number {
   public static void Factorial(int n){
       if (n<0){
          System.out.println("invalid number:");
         return ;
      }
     int fact=1;//
        for (int i=1;i<=n;i++){    // we can also write it :for(int i=n;i>=1;i--)
            fact=fact*i;
       }
        System.out.println("the factorial is"+fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        Factorial(a);
    }
}
