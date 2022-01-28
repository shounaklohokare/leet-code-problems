class Solution {
    public int mySqrt(int x) {
        
        int lo = 1;
        int hi = x;
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(mid == x / mid) return mid;
            
            if(mid < x/mid) lo = mid+1;
            
            else hi = mid-1;
            
        }
        
        return hi;
        
    }
}
