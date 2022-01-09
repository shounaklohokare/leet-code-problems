class Solution {
    public int specialArray(int[] nums) {
        
        int p = 0;
        while(true){
            
            int cnt=0;
            for(int ele : nums){
                if(ele >= p) cnt++;
            }
            
            if(p==cnt) return p;
            
            if(p==nums.length+1) return -1;
            
            p++;
        }
        
    }
}
