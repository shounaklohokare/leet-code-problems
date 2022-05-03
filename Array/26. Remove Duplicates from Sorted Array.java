class Solution {
    public int removeDuplicates(int[] nums) {
        
        int cnt=0;
        int n = nums.length;           // length of array num
        for(int i=0; i<n; i++){
            
            if(i<n-1 && nums[i]==nums[i+1]){
                continue;
            }            
            
            nums[cnt] = nums[i];
            cnt++;
            
        }
        
    }
}
   // check if i is less than or equal to n-2 thence making sure i+1 is always eligible index then check whether element at i is equal to i+1 if they are equal then element is not unique and hence we take the loop back at the start

// if i passes the if check then element at i is always unique thence initialise nums[i] to cnt which is a pointer

