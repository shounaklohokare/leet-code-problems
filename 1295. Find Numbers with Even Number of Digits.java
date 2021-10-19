class Solution {
    public int findNumbers(int[] nums) {
        
        int ans=0;
        for(int ele : nums){
            
            String str = Integer.toString(ele);
            
            if(str.length()%2==0) ans++;
            
            
        }
        
        return ans;
        
    }
}
