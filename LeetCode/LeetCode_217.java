package LeetCode;
import java.util.*;
public class LeetCode_217 {
    public static boolean duplicateElement(int arr[]){
      Arrays.sort(arr);
      for (int i=0;i< arr.length-1;i++){//i have some doubt here
          if(arr[i]==arr[i+1]){
              return true;
          }
      }
      return false;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //store the element in the array
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(duplicateElement(arr));
    }
}
