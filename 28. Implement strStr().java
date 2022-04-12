class Solution {
    public int strStr(String haystack, String needle) {

        int stepSize = needle.length();

        for (int i = 0; i <= haystack.length() - stepSize; i++) {
            if (haystack.substring(i, i + stepSize).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}