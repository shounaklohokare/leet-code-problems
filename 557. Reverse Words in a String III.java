class Solution {
    public String reverseWords(String s) {

        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {
                int j = i; // take j to start of the word
                while (j + 1 < ca.length && ca[j + 1] != ' ')
                    j++;
                reverseWord(ca, i, j);
                i = j;
            }
        }

        return new String(ca);

    }

    private void reverseWord(char[] ca, int i, int j) {
        for (; i < j; i++, j--) {
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
        }
    }
}