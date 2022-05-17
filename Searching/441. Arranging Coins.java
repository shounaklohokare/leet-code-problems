class Solution {
    public int arrangeCoins(int n) {
        
        int lo = 0;
        int hi = n;
        
        while(lo <= hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if((mid) * (mid+1)/2) <= n){
                // if mid * (mid+1) / 2 is less than or equal to n 
                // then assign lo to mid +1
                lo = mid+1;
            }
            else{
                // assign hi to mid-1
                hi = mid-1;
            }
            
        }
        
        return hi;   // at the point where lo is no longer less than or equal to hi
        // at that time where the number is hi is pointing is the answer
        
    }
}