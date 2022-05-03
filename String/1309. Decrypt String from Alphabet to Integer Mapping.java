class Solution {
    public String freqAlphabets(String s) {

        StringBuilder sblder = new StringBuilder();

        char[] str = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && str[i + 2] == '#') {
                int n = (str[i] - '0') * 10 + (str[i + 1] - '0'); // '9' - '0' = 9 (according to ASCII)
                sblder.append((char) (97 + n - 1));
                i += 2;
            }

            else
                sblder.append((char) (97 + (str[i] - '0' - 1)));
        }

        return sblder.toString();
    }
}