class Solution {
    public int search(int[] nums, int target) {
        
        
        int pivot = findPivot(nums);
        
        if(pivot==-1) return binarySearch(nums, target, 0, nums.length-1);
        
        
        if(nums[pivot]==target) return pivot;
        
        int ans;
        if(target >= nums[0]) ans = binarySearch(nums, target, 0, pivot-1);
        
        else ans = binarySearch(nums, target, pivot+1, nums.length-1);
        
        return ans;
        
    }
    
    int findPivot(int[] nums){
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mid < hi && nums[mid] > nums[mid+1]) return mid;
            
            if(mid > lo && nums[mid] < nums[mid-1]) return mid-1;
            
            if(nums[lo] >  nums[mid]) hi = mid-1;
            
            else lo = mid+1;
        
            
        }
        
        return -1;
    }
    
    int binarySearch(int[] nums, int target, int lo, int hi){
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(nums[mid]==target) return mid;
            
            else if(nums[mid] < target) lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        return -1;
        
    }
}
