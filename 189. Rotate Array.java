class Solution {
    public void rotate(int[] nums, int k) {
        
        k%=nums.length;  // take mod of k with length of array
        reverse(nums, 0, nums.length-1);  // reverse the whole array
        reverse(nums, 0, k-1);            // reverse the array from 0 to k-1
        reverse(nums, k, nums.length-1);  // reverse the array from k to length-1
        
    }
    
    void reverse(int[] nums, int start, int end){
        
        while(start < end){                 // reverse the array
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
}
