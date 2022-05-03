class Solution {
    public int missingNumber(int[] nums) {

        // here we have to find out a number between 0 to n that is missing in array
        // nums
        // we sort this array using cyclic sort

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]; // as the array contains numbers from 0 to n, the correctIndex is the number
                                        // value of the index itself
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) { //
                swap(nums, i, correctIndex);
            } else { // if the element is equal to n we skip it and increment the pointer
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index)
                return index; // if the element at index is not equal to index then return the index
        }

        return nums.length; // if not then the missing number is n thence return nums.length

    }

    private static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}