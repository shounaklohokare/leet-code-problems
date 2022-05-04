class Solution {
    public boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);
        System.out.print(pivot);
        if (pivot == -1)
            return binarySearch(nums, 0, nums.length - 1, target);

        if (nums[pivot] == target)
            return true;

        if (target >= nums[0])
            return binarySearch(nums, 0, pivot - 1, target);

        else
            return binarySearch(nums, pivot + 1, nums.length - 1, target);

    }

    int findPivot(int[] nums) {

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (mid < hi && nums[mid] > nums[mid + 1]) {
                // if mid is greater than mid + 1 then mid is the pivot thence we return it
                return mid;
            }

            if (lo < mid && nums[mid - 1] > nums[mid]) {
                // if mid-1 is greater than mid then mid-1 is the pivot thence we return it
                return mid - 1;
            }

            // condition where lo, mid and hi are equal
            if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
                // if elements at lo, mid and hi are equal
                // then there exists duplicates
                // we need to skip duplicates at lo and hi
                // by incrementing lo and decrementing hi

                if (lo < mid && nums[lo] > nums[lo + 1]) {
                    // but element at lo can also be pivot
                    // so we check whether it is pivot
                    // before incrementing it
                    return lo;
                }
                lo++;

                if (mid < hi && nums[hi - 1] > nums[hi]) {
                    // but pivot can be determined using hi as well
                    // therefore we check whether hi-1 is a pivot
                    // before decrementing hi
                    return hi - 1;
                }
                hi--;
            }

            else if ((nums[lo] < nums[mid]) || (nums[mid] == nums[lo] && nums[mid] > nums[hi])) {
                // condition where the left part of the array is appropriately sorted
                // and we need to check for pivot in right side
                // by assigning lo to mid + 1
                lo = mid + 1;
            } else {
                // condition where the right part of the array is appropriately sorted
                // and we need to check for pivot in left side
                // by assigning lo to mid + 1
                hi = mid - 1;
            }

        }

        return -1;

    }

    boolean binarySearch(int[] nums, int lo, int hi, int target) {
        // this is normal binary search w the exception that
        // we pass lo and hi as parameters
        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target)
                return true;

            if (nums[mid] < target)
                lo = mid + 1;

            else
                hi = mid - 1;

        }

        return false;

    }

}