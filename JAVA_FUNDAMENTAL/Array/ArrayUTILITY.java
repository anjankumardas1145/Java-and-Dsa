package JAVA_FUNDAMENTAL.Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayUTILITY {
    public static int[] inputArray(){

    Scanner sc =new Scanner(System.in);
        System.out.println("please enter the no of elements:");
        int size= sc.nextInt();
        int[] nums =new int[size];

        int i=0;
        while(i<size){
            System.out.println("please enter the element "+(i+1)+" input:");
            nums[i]=sc.nextInt();
            i++;
        }
        return nums;
}
//to display the array
    public static void displayArr(int[] myArr){
        int i=0;
        while(i< myArr.length){
            System.out.print(myArr[i]+" ");
            i++;
        }
        System.out.println();
    }
}