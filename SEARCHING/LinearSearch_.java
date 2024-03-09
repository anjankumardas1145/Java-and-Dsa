package SEARCHING;

import java.util.Scanner;

public class LinearSearch_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element into the array:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("display all the element:");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter the key element:");
        int key= sc.nextInt();
        for (int i=0;i< arr.length;i++){
            int ans=-1;

            if (arr[i]==key){
             ans=i;
                System.out.println("the key element is found at"+ans);
            }

        }
    }
}
