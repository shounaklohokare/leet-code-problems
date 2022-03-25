class Solution {
    public String toLowerCase(String s) {

        char[] out = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= out[i] && out[i] <= 'Z')
                out[i] = (char) (out[i] - 'A' + 'a');
        }

        return new String(out);

    }
}