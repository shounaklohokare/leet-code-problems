class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sblder = new StringBuilder();

        int w1l = word1.length();
        int w2l = word2.length();

        int p1 = 0, p2 = 0;
        while (p1 < w1l || p2 < w2l) {
            if (p1 < w1l)
                sblder.append(word1.charAt(p1++));
            if (p2 < w2l)
                sblder.append(word2.charAt(p2++));
        }

        return new String(sblder);

    }
}