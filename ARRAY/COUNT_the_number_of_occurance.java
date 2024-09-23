package ARRAY;

import java.util.Scanner;

public class COUNT_the_number_of_occurance {
    public static int occurance(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        //input
        System.out.println("enter thre elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the key element:");
        int k = sc.nextInt();
        occurance(arr, k);

        System.out.println("The number :"+k+" is entered " +occurance(arr,k)+" times by the user");
    }
}