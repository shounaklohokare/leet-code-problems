class Solution {
    public boolean canJump(int[] nums) {
        
        int lastGoodIndexPosition = nums.length-1; // initialise lastGoodIndexPosition to last position
        
        for(int i=nums.length-1; i>=0; i--){  // start traversing from end of array to its beginnings
            
            if(nums[i] + i >= lastGoodIndexPosition){ // if sum of index and value at index is greater than the the lastGoodIndexPosition then it is possible to traverse from the following element to ith element
                lastGoodIndexPosition = i;
            }
            
        }
        
        return lastGoodIndexPosition == 0; // if lastGoodIndexPosition is equals to zero then it is possible to jump
        
    }
}
