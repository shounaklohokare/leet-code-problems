class Solution {
    public int splitArray(int[] nums, int m) {
        
        int lo = 0;
        int hi = 0;
        
        for(int i=0; i<nums.length; i++){
            lo = Math.max(lo, nums[i]);
            hi+=nums[i];
        }
        
        while(lo < hi){
            
            int mid = lo + (hi-lo) / 2;
            
            int sum = 0;
            int pieces = 1;
            
            for(int num : nums){
                
                if(num + sum > mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
                
            }
            
            if(pieces > m) lo = mid+1;
                
            else hi=mid;
            
        }
        
        return hi;
        
        
        
    }
}
