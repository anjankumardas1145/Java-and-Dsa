package SEARCHING;

import java.util.Scanner;

public class LinearSearch {
    public static int Lsearch(int arr[],int key){
        int ans=-1;
        int step=0;
        for (int i=0;i< arr.length;i++){
            step++;
            if (arr[i]==key){
                ans=i;
                System.out.println("the number of step required for searching:"+step);
                return ans;
            }
        }
        System.out.println("the number of step required for searching");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        //declare the array
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("enter the the key:");
        int key= sc.nextInt();
        System.out.println("the key is found at "+Lsearch(arr,key));
    }
}
