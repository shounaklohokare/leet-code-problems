class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101]; // declare an array of size 101 as nums[i] is going to be in range 1 to 100, it
                                    // will act as a counter and keep a tally of how many numbers occur on the basis
                                    // of its index

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++; // increment the count by 1 at index occurence of each nums of i
        }

        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1]; // iteratively add each count index by its previous index
            // doing so will have each index of count the tally of numbers that are less
            // than or equal to it
        }

        for (int k = 0; k < nums.length; k++) {
            int idx = nums[k]; // keep idx equals nums[k], by doing this we are saving space
            nums[k] = idx == 0 ? 0 : count[idx - 1]; // if idx == 0 then we assign nums[k] =0 as there are no numbers
                                                     // less than zero if idx is greater than zero then we assign
                                                     // nums[k] = count[idx-1]
            // because idx will have count of numbers less than or equal to
            // as we want only less than we assign it to idx - 1
        }

        return nums;
    }
}