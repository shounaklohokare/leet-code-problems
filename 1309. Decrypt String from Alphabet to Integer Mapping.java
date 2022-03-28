class Solution {
    public String freqAlphabets(String s) {

        StringBuilder sblder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String n = s.charAt(i) + "" + s.charAt(i + 1);
                int k = 97 + Integer.parseInt(n) - 1;
                sblder.append((char) k);
                i += 2;
            } else if (s.charAt(i) != '#') {
                String c = "" + s.charAt(i);
                int n = 97 + Integer.parseInt(c) - 1;
                sblder.append((char) n);
            }

        }

        return sblder.toString();

    }
}