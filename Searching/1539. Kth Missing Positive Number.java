class Solution {
    public int findKthPositive(int[] arr, int k) {

        int lo = 0;
        int hi = arr.length; // as indexing starts from zero
        // and number might be greater than or equal to n
        // thence we keep hi as arr.length

        // we have to find the kth missing positive number

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            int missingCount = arr[mid] - (mid + 1);
            // as the index starts from 0
            // and if an array exists without any missing number
            // then its value = index+1
            // therefore missing count will number at current index - (index+1)
            // that is current value - ideal value = count of missing numbers

            if (missingCount >= k)
                hi = mid; // if the missing count >= count of missing numbers
            // then missing number exists on the left side of the array

            else
                lo = mid + 1; // else if missing count will be at right hand side of the array
        }

        // at the index on which the lo = hi
        // from that index + k will be the kth missing positive number

        return lo + k;

    }
}