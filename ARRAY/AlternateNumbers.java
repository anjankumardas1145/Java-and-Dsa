package ARRAY;
//only applicable for even number of element
public class AlternateNumbers {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4,5, 6};
        int[] alternateArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            if (i % 2 == 0) {
                alternateArray[i] = originalArray[i + 1];
            } else {
                alternateArray[i] = originalArray[i - 1];
            }
        }

// Print the alternate array
        System.out.println("Original Array:");
        printArray(originalArray);
        System.out.println("Alternate Array:");
        printArray(alternateArray);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



