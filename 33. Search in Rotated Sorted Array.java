class Solution {
    public int search(int[] nums, int target) {
        
        // given array nums is possibly rotated
        // a rotated array consists of two sub arrays
        // both are sorted in ascending array
        // the element at which one sorted array ends 
        // and the index following which another sorted array begins
        // is called a pivot element
        // pivot element is the maximum element in the array
        // finding the pivot element is the pivotal point in searching an element in a rotated sorted array  
        int pivot = findPivot(nums);
        
        if(pivot==-1) return binarySearch(nums, 0, nums.length-1, target);
        
        if(nums[pivot]==target) return pivot;
        
        if(nums[0] <= target) return binarySearch(nums, 0, pivot-1, target);
        
        return binarySearch(nums, pivot+1, nums.length-1, target);
        
    }
    
    int findPivot(int[] nums){
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mid < hi && nums[mid] > nums[mid+1]){
                // if the element at the previous index is greater than the element at the following index
                // then element at the previous index is the pivot
                return mid;
            }
            
            if(lo < mid && nums[mid-1] > nums[mid]){ 
                // similar condition as that of the above one
                return mid-1;
            }
            
            if(nums[lo] < nums[mid]){
                // if element at lo is less than that of the element at the mid
                // then the pivot element is in the right hand side of the array
                lo = mid+1;
                // thus we initialise lo to mid+1
            }
            
            else{
                // if element at mid is greater than that of the element at hi
                // then the element is at the right hand side of the array 
                hi = mid-1;
                // thus we initialise hi to mid-1
            }
            
            
        }
        return -1;
        
    }
    
    int binarySearch(int[] nums, int lo, int hi, int target){
        // this is normal binary search w the exception that
        // we pass lo and hi as parameters 
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(nums[mid] == target) return mid;
            
            if(nums[mid] < target) lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        return -1;
        
    }
}
