class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] res = new int[n];
        
        int left = 1;
        for(int i=0; i<n; i++){
            
            if(i > 0) left *= nums[i-1];     // calculate product of numbers which are on every numbers left 
            
            res[i] = left;          // assign that product in o/p array
            
        }
        
        int right=1;
        for(int i=n-1; i>=0; i--){
            
            if(i < n-1) right *= nums[i+1];     // calculate product of numbers which are on every numbers right
            
            res[i] *= right;          // multiply it with product of numbers on every numbers left
            
        }
        // product of every number in the array except itself is the product of number on its left multiplied by product of evey number on its right
        return res;
        
    }
}
