package ARRAY;

import java.util.Scanner;

public class SECOND_largest {
    public static int ans(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

        /*Q:Given an array a consisting of integer .Return the first value that is repeating in this array
               If no value is being repeated ,if no repeation then return -1*/
        public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array::");
        int n=sc.nextInt();
        //declare the array
        int arr[]=new int[n];
            System.out.println("enter "+n+" elements");
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ans(arr);

            System.out.println("First repeating number "+ans(arr));//function call
    }
}
