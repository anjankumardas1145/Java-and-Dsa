import java.util.Scanner;

public class Triplet_sum {

    public static int returnTriplet(int arr[], int target) {
        int result = 0;
        // Traverse the array to find the triplets
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        result++;
                        // Corrected the printing to show all three indexes and elements
                        System.out.println("In These indexes: ( " + i + " , " + j + " , " + k + " )");
                        System.out.println("( " + arr[i] + " , " + arr[j] + " , " + arr[k] + " )");
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the sum whose triplets you want to see:");
        int target = sc.nextInt();

        // Input elements into the array
        System.out.println("Enter elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call
        int ans = returnTriplet(arr, target);
        System.out.println("Number of triplets with sum " + target + " is: " + ans);
    }
}
