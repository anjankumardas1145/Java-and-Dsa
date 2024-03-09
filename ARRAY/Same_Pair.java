package ARRAY;

import java.util.Scanner;

public class Same_Pair {
    public static void SMpair(int arr[]){
        int count=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                    count++;


                }
            }
        }
        System.out.println("the total number of pair is:"+count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        //declare the array
        int arr[]=new int[n];
        System.out.println("enter the number of element:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        SMpair(arr);

    }
}
