package IMPORTANT_;

import java.util.Scanner;

public class BianryToDecimal_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number:");
        String binaryNumber=sc.nextLine();
        double decimal=0;
        int power=0;
        for(int i=binaryNumber.length()-1;i>=0;i--){
            int digit=Character.getNumericValue(binaryNumber.charAt(i));
            decimal = decimal + digit *  Math.pow(2, power);
            power++;
        }
        System.out.println("the eqivalent decimal number is: "+decimal);
    }
}
