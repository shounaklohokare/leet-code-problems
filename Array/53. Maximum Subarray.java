class Solution {
    public int maxSubArray(int[] nums) {
        
        int curSum = nums[0];
        int maxSum = nums[0];
        
        for(int i=1; i<nums.length; i++){
            curSum = Math.max(nums[i], curSum + nums[i]); // if current element is greater than sum of previous elements then disregard the current sum in calculation and use only the current element
            maxSum = Math.max(curSum, maxSum);    // take the max sum of current sum and max sum
        }
        
        return maxSum; // return max sum
        
    }
}
