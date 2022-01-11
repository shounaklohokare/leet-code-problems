class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo<hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(arr[mid] < arr[mid+1]) lo = mid+1; // if mid+1 > mid we know that the largest element is at the right hand side of array thus we initialise lo to mid + 1
            
            else if(arr[mid] > arr[mid+1]) hi = mid; // if mid+1 is less than mid we know that the largest element is at left hand side and the largest element could be mid itself thus we initialise hi to mid
            
        }
        // when lo = hi i.e lo and hi point to a single element then that is the largest element.
        
        return lo;
        
    }
}
