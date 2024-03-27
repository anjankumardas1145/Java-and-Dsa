package ARRAY;
import java.util.Scanner;
public class Triplet_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the sum");
        int sum=sc.nextInt();
        int count=0;
        System.out.println("input the element into the array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++){//first number
            for (int j=i+1;j<n;j++){//second number
                for (int k=j+1;k<n;k++){//third number
                    if (arr[i]+arr[j]+arr[k]==sum){
                        System.out.println( " the indices are :[ "+i+" "+ j +" "+ k+ "]");
                        count++;
                    }
                }
            }
        }
        System.out.println("the number of pair whose sum is:"+count);
    }
}
