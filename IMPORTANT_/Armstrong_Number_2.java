package IMPORTANT_;

import java.util.Scanner;

public class Armstrong_Number_2 {
    public static int countDigits(int number){
        int count=0;
        while(number>0){
            count++;
            number/=10;
        }
        return count;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int number= sc.nextInt();
        int sum = 0;
        int numberOfDigits = countDigits(number);
int originalNumber=number;
while(number>0){
    int reminder=number%10;
    sum=sum+(int)Math.pow(reminder,numberOfDigits);
    number/=10;
}
if(originalNumber==sum){
    System.out.println("armstrong number");
}else{
    System.out.println("not a arm strong number");
}
    }
}
