package ARRAY;

import java.util.Scanner;

public class Insert_a_location {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the data:");
        int n=sc.nextInt();
        int arr[]=new int[10];

        System.out.println("enter the element into the array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //for position
        System.out.println("enter the position:");
        int po= sc.nextInt();
        System.out.println("input new element:");
        int nw=sc.nextInt();
        for (int i=n;i>=po;i--){
            arr[i]=arr[i-1];
        }
        arr[po-1]=nw;
        //display
        for (int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //input new element

}