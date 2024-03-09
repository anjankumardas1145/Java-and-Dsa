package LOOP;

import java.util.Scanner;

public class sum_of_N_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println("the sum of the given   number is: "+sum);

    }
}
