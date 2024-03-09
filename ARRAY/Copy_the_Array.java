package ARRAY;

import java.util.Scanner;

public class Copy_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //input the element into the array
        System.out.println("enter the elements:");
        for (int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }
        int arr2[]=arr;
        System.out.println("the copied array is:");
        for (int i=0;i<n;i++){

            System.out.print(arr2[i]+" ");
        }
    }
}
