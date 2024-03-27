package JAVA_FUNDAMENTAL.Array;

import java.util.Scanner;

public class Challenge_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to array frequency");
        int [] numArr=ArrayUTILITY.inputArray();
        System.out.println("enter the number you want to find:");
int num= sc.nextInt();
int occurance=noOfOccurance(numArr,num);
        System.out.println("My number is founnd " + occurance +" times in the array ");



    }
    public static int noOfOccurance(int[] numArr,int num){
        int occ=0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
