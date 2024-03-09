package SORTING;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter he size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("input into the array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the elements of the array are:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            //System.out.println("the sorted array: is");

        }
        System.out.println("the sorted array is:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
