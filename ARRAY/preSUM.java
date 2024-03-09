package ARRAY;

import java.util.Scanner;

public class preSUM {
    public static void preSUM(int arr[]){
       int n= arr.length;
       int ans[]=new int[n];
       ans[0]=arr[0];
       for (int i=1;i<n;i++){
           ans[i]=ans[i-1]+arr[i];

        System.out.println(ans[i]);}
    }
    public static void main(String[] arg){//my output should be//input array element: 2 3 4 5 6
                                                              //output 2 5 9 14 20
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the element:");
        int n= sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter "+n+" elements");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        preSUM(arr);
        }
    }

