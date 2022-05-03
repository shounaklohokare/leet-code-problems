class Solution {
    public int maxRepeating(String sequence, String word) {

        int out = 1;
        // repeats word incrementally and checks whether it exists in string
        while (sequence.contains(word.repeat(out))) {
            out++;
        }

        return out - 1;
    }
}