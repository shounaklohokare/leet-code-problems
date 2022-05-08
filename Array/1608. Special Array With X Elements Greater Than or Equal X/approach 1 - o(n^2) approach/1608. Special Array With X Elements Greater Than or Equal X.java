class Solution {
    public int specialArray(int[] nums) {
        
        int i = 0;
        while(i<=nums.length){
            
            int cnt=0;
            
            for(int ele : nums){
                if(ele >= i) cnt++;
            }
            
            if(cnt==i) return cnt;
            i++;
        }
        
        return -1;
        
    }
}