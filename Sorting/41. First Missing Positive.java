class Solution {
    public int firstMissingPositive(int[] nums) {

        // we have to find the first missing positive number
        // thus we can consider sorting the array from 1 to n
        // using cyclic sort

        int i = 0;
        while (i < nums.length) {

            int correctIndex = nums[i] - 1; // correct index position will be element at i - 1

            if (correctIndex >= 0 && correctIndex < nums.length && nums[i] != nums[correctIndex]) {
                // first we check whether the correct index position is a valid index
                // if its greater -1 and less than n
                // then we check whether the number at i is inequal to number at correctIndex
                swap(nums, i, correctIndex); // if they are inequal then we swap elements
            } else {
                // if any of the above condition is not true then we increment pointer i
                i++;
            }

        }

        for (i = 0; i < nums.length; i++) {
            // we iterate the array and return the first number which is not equal
            // to its valid number from its index position
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums.length + 1;
    }

    private void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}