class Solution {
    public boolean search(int[] nums, int target) {
        
        int pivot = findPivotInDuplicates(nums);
        System.out.println(pivot);
        
        if(pivot==-1) return binarySearch(nums, target, 0, nums.length-1);
        
        if(nums[pivot]==target) return true;
        
        if(nums[0]<=target) return binarySearch(nums, target, 0, pivot-1);
        
        return binarySearch(nums, target, pivot+1, nums.length-1);
        
        
    }
    
    int findPivotInDuplicates(int[] nums){
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mid < hi && nums[mid] > nums[mid+1]) return mid;
            
            if(lo < mid && nums[mid-1] > nums[mid]) return mid-1;
            
            if(nums[lo] == nums[mid] && nums[mid] == nums[hi]){
                
                if(lo < mid && nums[lo] > nums[lo+1]) return lo;
                
                lo++;
                
                if(mid < hi && nums[hi-1] > nums[hi]) return hi-1;
                
                hi--;
                
            }
            
            else if((nums[lo] < nums[mid]) || (nums[mid]==nums[lo] && nums[mid] > nums[hi])){
                lo = mid+1;
            }
            
            else hi = mid-1; 
        }
        return -1;
        
    }
    
    boolean binarySearch(int[] nums, int target, int lo, int hi){
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(nums[mid]==target) return true;
            
            if(nums[mid] < target) lo = mid+1;
            
            else hi = mid-1;
            
        }
        return false;
        
    }
}
