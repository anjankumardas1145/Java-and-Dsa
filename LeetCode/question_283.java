package LeetCode;



    public class question_283{
        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);

            // Print the modified array
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        public static void moveZeroes(int[] nums) {
            int nonZeroIndex = 0; // Pointer for the position of the next non-zero element

            // Traverse through the array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    // Swap the current element with the element at nonZeroIndex
                    int temp = nums[nonZeroIndex];
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = temp;

                    // Move the nonZeroIndex to the next position
                    nonZeroIndex++;
                }
            }
        }
    }


