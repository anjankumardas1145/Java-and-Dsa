package IMPORTANT_;



        import java.util.Scanner;

public class BinarySearch {
    /**
     * This BinaryS is a method made by me ("Anjan Kumar Das")
     * @param arr
     * @param key
     * @return index of the key, or -1 if not found
     */
    public static int BinaryS(int arr[], int key) {
        int start = 0;
        int last = arr.length - 1;
        int ans = -1;

        while (start <= last) {
            int mid = (start + last) / 2;
            if (arr[mid] == key) {
                ans = mid;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return ans;
    }

    /**
     * Method to check if the array is sorted in ascending order
     * @param arr
     * @return true if sorted, false otherwise
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search:");
        int key = sc.nextInt();

        // Check if array is sorted

        boolean sorted = isSorted(arr);

        if (!sorted) {
            System.out.println("The array is not sorted. Searching is not possible.");
        } else {
            int result = BinaryS(arr, key);
            System.out.println(result != -1 ? "The number is found at index: " + result : "The number is not found.");
        }

    }
    }


