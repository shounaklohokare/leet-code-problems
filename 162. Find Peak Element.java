class Solution {
    public int findPeakElement(int[] nums) {
        
        int lo = 0;
        int hi = nums.length-1;
        // a bitonic array or a mountain array is given
        // which refers to an array whose elements increases and then starts decreasing
        // the element after which the elements start decreasing is called a peak
        // the given array might have multiple peaks 
        // we have to return any one of those peaks
        while(lo < hi){
            
            int mid = lo + (hi-lo) / 2;                
              
            if(nums[mid] > nums[mid+1]){
                // if the element at mid is greater than the element at mid+1
                // it means that the element at the previous index is greater than the element at the latter index
                // which means we are in the decreasing part of the array
                // and that mid might be a peak
                hi = mid;
                // thus we initialise hi to mid
            }
             
            else {
                // element at latter index index is greater than the element at prev index
                // thus we are in the increasing part of the array 
                // which means that peak will be at an index greater than that of mid
                lo = mid+1;
                // thence we initialise lo to mid+1
            }
            
            // both the if else conditions of the while loop
            // take the pointers lo and hi to a peak of the array
            // when lo equals to hi 
            // that element is definitely one of the peaks
            
        }
        
        
        return lo;  // thus we can return either lo or hi
        
    }
}
