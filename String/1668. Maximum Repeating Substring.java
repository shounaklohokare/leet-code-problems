class Solution {
    public int maxRepeating(String sequence, String word) {

        int out = 1;
        // .contains() return boolean value
        // repeat(int count) repeats the word by value of count
        while (sequence.contains(word.repeat(out))) {
            // we iteratively increase value of out
            // which means we iteratively check whether
            // the word repeating out times contains in string
            // if it does we increment out and check
            out++;
        }

        return out - 1; // when it's false we return it by substracting 1

    }
}