package ARRAY;

import java.util.Scanner;

public class Taking_input_from_user {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element into the array;");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
