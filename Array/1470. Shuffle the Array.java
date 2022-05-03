class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
        int[] ans = new int[nums.length];
        
        int i=0;
        int j=n;
        int curr=0;
        
        while(i<n){
            
            ans[curr]=nums[i];
            i++;
            curr++;
            
            ans[curr]=nums[j];
            j++;
            curr++;
        }
        
        return ans;
        
    }
}
