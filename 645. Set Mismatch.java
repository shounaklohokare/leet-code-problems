class Solution {
    public int[] findErrorNums(int[] nums) {
        
        // nums contains number in range 1 to n
        // in which there is repetition of one number and loss of another number.
        
        int i=0;
        while(i<nums.length){
            
            int correctIndex = nums[i] - 1;       // compute correct index of each number
            
            if(nums[correctIndex]!=nums[i]){
                swap(nums, correctIndex, i);      // if the number is at incorrect index then swap from the correct index 
            }else{
                i++;                              // if it's at correct index then increment pointer
            }
            
        }
        
        // results in sorted nums, in which one number is at incorrect index 
        // because it is the one which is repeated
        
        for(i=0; i<nums.length; i++){             // iterate through array
            if(nums[i]!=(i+1)){                   // if a number has the wrong value
                return new int[] {nums[i], i+1};  // then that number is repeated and return the repeated number:- nums[i] and correct number:- i+1
            } 
        }
        
        return new int[] {-1, -1};
        
    }
    
    private void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}