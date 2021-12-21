class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            int missingCount = arr[mid]-mid-1;
            
            if(missingCount < k) lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        
        if (hi < 0) return k;
        int count = arr[hi]-hi-1;
        return arr[hi]-count+k;
        
    }
}
