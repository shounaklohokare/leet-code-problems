class Solution {
    public int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x + 1]; // counts will keep occurence count of each number in nums
                                       // as indexing starts from 0 we initialise the length of counts to nums.length +
                                       // 1

        // if nums = [3, 5]
        // counts = [0, 0, 0, 0] to have indices 0, 1, 2, 3
        // the last index will keep count of any number that is greater than or equal to
        // it

        for (int elem : nums)
            if (elem >= x) {
                // if the element is greater than or equal to x then we increment counts[x]
                counts[x]++;
            } else {
                // else we increment counts[elem]
                counts[elem]++;
            }

        int res = 0; // initialise res to 0 it will keep count of numbers that are
                     // greater than or equal to the current number of i
        for (int i = counts.length - 1; i > 0; i--) {
            // increment res with the value of counts[i]
            res += counts[i];
            if (res == i) // if res is equal to i then return it
                return i;
        }

        return -1;
    }
}