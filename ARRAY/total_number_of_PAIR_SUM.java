package ARRAY;

import java.util.Scanner;

public class total_number_of_PAIR_SUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("sum is:");
        int sum=sc.nextInt();
        int count=0;
        System.out.println("input the array into the array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==sum){
                    count++;
                }
            }
            //System.out.println("the sum of key in total is"+count);
        }
        System.out.println("total number of pair:"+count);
    }
}
