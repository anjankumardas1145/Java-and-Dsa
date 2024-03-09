package ARRAY;

import java.util.Scanner;

public class smallest_larg_sec_Lar_sec_small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("insert the element into the array:");
        for (int i=0;i< n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("displaying the element:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //for sorting
        System.out.println("hello");
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp=0;
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("the largest number is:"+arr[n-1]);
        System.out.println("the second largest number is:"+arr[n-2]);
        System.out.println("the smallest number is:"+arr[n-n]);
        System.out.println("the second largest number is:"+arr[n-n+1]);
    }
}
