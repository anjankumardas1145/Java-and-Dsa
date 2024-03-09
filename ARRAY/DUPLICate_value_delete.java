package ARRAY;
import java.util.*;
public class DUPLICate_value_delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element into the array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;){
                if (arr[i]==arr[j]){
                    for (int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
                else{
                    j++;
                }
            }
        }
        System.out.println("elements of array are:");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }}

