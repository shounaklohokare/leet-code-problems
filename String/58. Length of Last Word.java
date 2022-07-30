class Solution {
    public int lengthOfLastWord(String s) {

        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            // start iterating string from its end
            if (s.charAt(i) != ' ') {
                // if the current character is not a whitespace
                // increase the length by 1
                length++;
            } else {
                // if its a whitespace
                // then check if length is greater then zero
                // if yes then the length of the last word is already computed
                // as string contains at least one word
                // thence return length
                if (length > 0)
                    return length;
            }
        }

        return length; // return length in the case if there isn't a whitespace occured
    }
}