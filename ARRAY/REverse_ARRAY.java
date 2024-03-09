package ARRAY;

import java.util.Scanner;

public class REverse_ARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of the element:");
        int a= sc.nextInt();
        int arr[]=new int[a];
        System.out.println("input into the array:");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int asn[]=arr;
        System.out.println(" after reversing the element into the ans array:");
        for (int i=a-1;i>=0;i--){
            System.out.print(asn[i]+" ");
        }
    }
}
