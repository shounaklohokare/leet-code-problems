class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();

        String half1 = s.substring(0, n / 2).toLowerCase();
        String half2 = s.substring(n / 2, n).toLowerCase();

        int v = 0;
        for (int i = 0; i < n / 2; i++) {
            char h1c = half1.charAt(i);
            char h2c = half2.charAt(i);
            if (h1c == 'a' || h1c == 'e' || h1c == 'i' || h1c == 'o' || h1c == 'u')
                v++;

            if (h2c == 'a' || h2c == 'e' || h2c == 'i' || h2c == 'o' || h2c == 'u')
                v--;
        }

        return v == 0;
    }
}