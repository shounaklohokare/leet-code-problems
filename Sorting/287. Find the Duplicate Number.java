class Solution {
    public int findDuplicate(int[] nums) {
        
        // we have to find the duplicate number in nums
        // elements in nums are in the range [1, n] inclusive.
        
        
        int i=0;
        while(i<nums.length){
            // using cylic sort
            int correct = nums[i]-1;                            // correct index is nums[i] - 1
            if(nums[i]!=nums[correct]){                     
                // if the number is not at correct index then swap
                swap(nums, i, correct);
            }else if(nums[i]==nums[correct] && i!=correct){
                // if the number is at correct index and the value of i is not equal to correct
                // then the number is repeated 
                return nums[i];        // thus return it
            }else{
                i++;                   // else the number is at correct index 
                                       // and neither it is repeated therefore increment the pointer
            }
        }
        return -1;
        
    }
    
    private static void swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}