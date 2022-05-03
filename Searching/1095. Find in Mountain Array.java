/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = findPeak(mountainArr); // find peak in the biotonic array
        
        
        int ans = binarySearch(mountainArr, 0, peak, target); // as we have to find min index first search for target in ascending array i.e in left part of array
        
        if(ans==-1){
            ans = binarySearch(mountainArr, peak+1, mountainArr.length()-1, target); // if target is not found in ascending array then look in descending array i.e right part of array
        }
        
        return ans;
    }
    
    int findPeak(MountainArray mountainArr){
        
        int lo = 0;
        int hi = mountainArr.length()-1;
        
        while(lo < hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) lo = mid+1;
            
            else hi = mid;
            
        }
        
        return lo;
        
    }
    
    int binarySearch(MountainArray mountainArr, int lo, int hi, int target){ // order agnostic binary search
        
        boolean isAsc = mountainArr.get(lo) < mountainArr.get(hi); // first check if array is ascending or not
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mountainArr.get(mid)==target) return mid;
            
            else if(isAsc){ // search accordingly if ascending
                
                if(mountainArr.get(mid) < target) lo = mid+1;
                
                else hi = mid-1;   
            }     
            else{ // search accordingly if descending
                
                if(mountainArr.get(mid) < target) hi = mid-1;
                
                else lo = mid+1;
                
            }
        }
        
        return -1;
    }
}
