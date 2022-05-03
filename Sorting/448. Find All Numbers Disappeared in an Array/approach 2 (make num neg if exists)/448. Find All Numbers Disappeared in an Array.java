class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // we have to find missing integers in the array in the range [1, n] that do not
        // appear in the array

        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            // if the number exists then compute its correct index
            if (nums[i] < 0) {
                // if the element at index is already negative then ignore and compute the
                // correct index
                idx = nums[i] * -1 - 1;
            } else {
                idx = nums[i] - 1;
            }

            if (nums[idx] > 0) {
                // if the element is greater than zero then make it negative
                nums[idx] = -nums[idx];
            }

        }

        // after making the elements at indices negative only for those who exists

        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // iterate through the array, if the number at index is postive
            // then the number at that index is missing
            if (nums[i] > 0) {
                out.add(i + 1); // thence add it to out
            }
        }

        return out;

    }
}