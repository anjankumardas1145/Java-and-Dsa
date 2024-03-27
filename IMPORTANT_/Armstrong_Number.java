package IMPORTANT_;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("your number is armstrong");
        }else{
            System.out.println("your number is not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfdigits=noOfdigits(num);//function noOfdigits calling here
        int numCopy=num;
        System.out.println("no of digit: "+ noOfdigits);
        int finalNumber=0;
        while(num>0){
int lastDigit=num%10;
num/=10;
finalNumber+=power(lastDigit,noOfdigits);}
        System.out.println("THE final number is|:"+finalNumber);
        return finalNumber==numCopy;
    }
//power function
    public static int power(int num1,int num2){
        int result=1;
        int i=0;
        while(i<num2){
            result*=num1;
            i++;
        }
        System.out.println("power of "+num1+" is "+result);
        return result;
    }
    //to count the number of digits
    public static int noOfdigits(int num){
int digits=0;
while(num>0){
    int rem=num%10;
    digits++;
    num/=10;
}
return digits;
    }
}
