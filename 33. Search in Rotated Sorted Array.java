class Solution {
    // a rotated sorted array basically contains two arrays which are sorted in the ascending order, the trick is to find the pivot 
    public int search(int[] nums, int target) {
        
        int pivot = findPivot(nums);
        
        if(pivot==-1) return binarySearch(nums, target, 0, nums.length-1); // if pivot equals -1 then array is not rotated
        
        if(nums[pivot]==target) return pivot;  
        
        if(nums[0] <= target) return binarySearch(nums, target, 0, pivot-1); // if 0th element is less than or equal to target then the target element is in the first ascending array

        
        return binarySearch(nums, target, pivot+1, nums.length-1); // else the target is in second ascending array

        
        
        
    }
    
    int findPivot(int[] nums){
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mid < hi && nums[mid] > nums[mid+1]) return mid;  // if (mid)th element > (mid+1)th, then mid is pivot as the previous element can't be greater than following element in sorted array
             
            if(lo < mid && nums[mid-1] > nums[mid]) return mid-1; // similarly if mid - 1 is greater than mid then mid -1 is the pivot
            
            if(nums[lo] < nums[mid]) lo = mid+1; // if element is lo less than element at mid then target is at following part of array thus we initialise lo to mid+1
            
            else hi = mid-1; // else target is at prev part so we initialise hi to mid-1
            
        }
        
        return -1;
        
        
    }
    
    int binarySearch(int[] nums, int target, int lo, int hi){
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(nums[mid] == target) return mid;
            
            if(nums[mid] < target)  lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        return -1;
    }
}
