package JAVA_FUNDAMENTAL.OPERATOR;

import java.util.Scanner;

public class bitWIse_even_odd {

    //Look how can we identify a number is even or odd
    //0=0000
    //1=0001
    //2=0010
    //3=0011
    //4=0100;
    //5=0101
    //6=0110
    //7=0111
    //8=1000
    //9=1001
    //10=1010
    //notice one thing all even number has 0 at their unit palce and all the odd number has 1 at their unit place
    //so how can we find the unti digit of the number
    // perform bitwise and with 1,...i.e (num&1)
    //perform & 1,,ex 7=0111,(7&1)=0111 & 0001=1......for a even number ex=6,,(6&1)=0110&0001=0000
    //notice one thing after the bitwise and operation
    //the odd number i,e 7 has 1 in its unit place where as the even number 6 has 0 in  its unit place
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if((num&1)==1){
            System.out.println("the number "+num+" is odd");
        }else{
            System.out.println("the number "+num+" is even");
        }
    }
}
