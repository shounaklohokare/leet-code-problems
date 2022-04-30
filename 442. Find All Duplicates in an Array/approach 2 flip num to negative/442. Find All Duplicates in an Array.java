class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // when find a number i, flip the number at correct index position i-1 to
        // negative.
        // if the number at correct index position i-1 is already negative, i is the
        // number that occurs twice.
        List<Integer> out = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int correctIndex = Math.abs(nums[i]) - 1; // computing correct index position

            if (nums[correctIndex] < 0) {
                // if it is already negative then that number is occuring second time thence add
                // it to the out
                out.add(Math.abs(correctIndex + 1));
            }

            nums[correctIndex] = -nums[correctIndex]; // then make the number at correct index position negative
        }

        return out;

    }
}