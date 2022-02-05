class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        // in an array sorted in an ascending order
        // the first occurence of a number is on the left hand side of the array
        // and last occurence of a number is on the right hand side of the array
        
        int[] out = new int[] {-1, -1};
        
        out[0] = binarySearch(nums, target, true);  // as in the first element of o/p array we have to send the starting position of target in array, we send true as a parameter
        
        if(out[0] > -1) out[1] = binarySearch(nums, target, false); // as in the second element of the o/p array we have to send the ending position of target in array, thus we send false as parameter
        
        return out;
        
    }
    
    int binarySearch(int[] nums, int target, boolean isFirstOccurence){
        
        int ans = -1;
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo <= hi){
            
            int mid = lo + (hi - lo) / 2;
            
            if(nums[mid]==target){
                ans = mid;
                
                if(isFirstOccurence) hi = mid-1; // if target is at mid and it is the first occurence then we try to look at another target element at left of array thus we assign hi to mid-1
                
                else lo = mid+1; // if target is at mid and it not the first occurence that is the last occurence then we assign lo to mid+1
                
            }
            
            else if(nums[mid] < target) lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        return ans;
        
        
    }
}
