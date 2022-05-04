class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> out = new ArrayList<>();

        int i = num.length;
        int curr = k; // number to be added in the array form
        while (--i >= 0 || curr > 0) {
            // run loop while
            // i is greater than or equal to zero
            // and while curr is greater than zero

            if (i >= 0) {
                // add num element at i
                // in curr
                curr += num[i];
            }

            out.add(0, curr % 10); // add modulus 10 of curr in arraylist
            curr /= 10; // floor divide curr by 10

        }

        return out;

    }
}