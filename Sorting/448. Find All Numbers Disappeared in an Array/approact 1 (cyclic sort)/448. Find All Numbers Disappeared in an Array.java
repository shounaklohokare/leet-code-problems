class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // we have to find missing integers in the array in the range [1, n] that do not
        // appear in the array

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // correct index equals to value - 1 (because elements start from 0) thus
                                       // correct index is value - 1

            if (nums[correct] != nums[i]) { // if number not at correct index
                swap(nums, i, correct); // then swap
            } else {
                i++; // if number at current index then increment
            }
        }

        List<Integer> out = new ArrayList<>(); // array list for output
        for (int index = 0; index < nums.length; index++) { // iterate the nums array
            if (nums[index] != index + 1) { // if value of index is not equal to index+1
                out.add(index + 1); // then that is the missing number thus add index+1 to the out put array list
            }
        }
        System.out.println(Arrays.toString(nums));
        return out;
    }

    static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}