class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                j++;
                nums[j]=nums[i];
            }
        }
        
        return j+1;
    }
}
