class Solution {
    public int findNumbers(int[] nums) {
        
        int ans=0;
        for(int ele : nums){
            
            int cnt=0;
            
            while(ele > 0){
                cnt++;
                ele/=10;
            }
            
            if(cnt%2==0)ans++;
        }
        
        return ans;
        
    }
}
