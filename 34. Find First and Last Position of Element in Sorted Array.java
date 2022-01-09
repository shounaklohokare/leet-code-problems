class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] out = {-1, -1};
        
        out[0] = binarySearch(nums, target, true);
        
        if(out[0]>-1) out[1] = binarySearch(nums, target, false);
        
        return out;
        
    }
    
    int binarySearch(int[] nums, int target, boolean isFirstOccurence){
        
        int ans = -1;
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo <= hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(nums[mid]==target){
                ans = mid;
                
                if(isFirstOccurence) hi = mid-1;
                
                else lo = mid+1;
            }
            else if(nums[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
            
        }
        
        return ans;
        
    }
}
