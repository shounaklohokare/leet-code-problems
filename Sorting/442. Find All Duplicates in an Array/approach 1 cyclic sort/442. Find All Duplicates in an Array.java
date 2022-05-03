class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[correct] != nums[i]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }

        List<Integer> al = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1))
                al.add(nums[i]);
        }

        return al;

    }

    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}