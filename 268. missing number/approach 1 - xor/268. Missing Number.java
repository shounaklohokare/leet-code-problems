class Solution {
    public int missingNumber(int[] nums) {

        // xor operation is represented by ^
        // x^x^y = y
        // it is used to eliminate duplicates

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        // here we have to find out a number between 0 to n that is missing in array
        // if we xor the 0 to n and elements in the array
        // the numbers present in the array are eliminated and we are left with the
        // missing number
        return xor ^ i;

    }
}