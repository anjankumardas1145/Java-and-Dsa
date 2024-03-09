package SEARCHING;
import java.util.Scanner;

public class BinarySearch {
    /**
     * ths  BinaryS is a method made by me("Anjan Kumar Das")
     * @param arr
     * @param key
     * @return
     */
    public static int BinaryS(int arr[],int key){//the element must be sorted in binary search
        int start=0;
        int last= arr.length-1;
        int ans=-1;
        while(start<=last){

            int mid=(start+last)/2;
            if (arr[mid]==key){
                ans=mid;
                break;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }else{
                last=mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" enter the  number you want to search");
        int key=sc.nextInt();
        BinaryS(arr,key);
        System.out.println("the number  is found at index:"+BinaryS(arr,key));
    }
}
