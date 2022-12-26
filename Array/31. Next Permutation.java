class Solution {
    public void nextPermutation(int[] nums) {
        
        int pivot = getPivotFromLast(nums);

        if(pivot!=-1){
            int numGreaterThanPivot = numGreaterThanPivot(nums, pivot);

            swap(nums, pivot, numGreaterThanPivot);
        }

        reverse(nums, pivot+1, nums.length-1);

    }

    int getPivotFromLast(int[] nums){

        for(int i=nums.length-1; i>0; i--){

            if(nums[i-1] < nums[i]){
                return i-1;
            }

        }

        return -1;
    }

    int numGreaterThanPivot(int[] nums, int pivot){

        for(int i=nums.length-1; i>0; i--){
            if(nums[i] > nums[pivot]){
                return i;
            }
        }
        return -1;
    }

    void reverse(int[] nums, int s, int e){

        while(s < e){
            swap(nums, s++, e--);
        }

    }

    void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}