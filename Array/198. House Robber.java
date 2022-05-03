class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0) return 0;

        int prev1=0;
        int prev2=0;
        
        for(int num : nums){
            // the order is :-  prev2 prev1 num
            int tmp = prev1;
            prev1 = Math.max(prev2+num, prev1);  // prev1 contains max sum
            prev2 = tmp;                   // prev2 contains max single element
        }
        
        return prev1;  // return sum
        
    }
}
