package IMPORTANT_;
import java.util.Scanner;
public class LinearSearch {
    public static void linearSearch(int target, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The target element is found at index: " + i);
                return; // Exit after finding the element
            }
        }
        System.out.println("The target element is not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        // Input array
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        linearSearch(target, arr);
    }
}






