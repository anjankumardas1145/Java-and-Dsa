package FUNCTION;

import java.util.Scanner;

public class GCD_of_Two {
    public static int GCD(int a,int b){
        while (b != 0) {

            if (a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();//a=12=1,2,3,4,6,12
        int b=sc.nextInt();//b=18=1,2,3,6,9,18 here the greatest common divisior is 6
        System.out.println("GCD of"+ a + "and" +b+ " is :" +GCD(a,b));
    }

}
