class Solution {
    public int findMin(int[] nums) {
        
        int pivot = findPivot(nums);
        
        return nums[pivot+1];
        
    }
    
    int findPivot(int[] nums){
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mid < hi && nums[mid] > nums[mid+1]) return mid;
            
            if(lo < mid && nums[mid-1] > nums[mid]) return mid-1;
            
            if(nums[lo] < nums[mid]) lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        return -1;
        
        
    }
}
