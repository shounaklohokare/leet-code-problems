class Solution {
    public String reverseWords(String s) {

        String[] strings = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            StringBuilder intrm = new StringBuilder();
            for (int j = strings[i].length() - 1; j >= 0; j--) {
                intrm.append(strings[i].charAt(j));
            }
            if (i < strings.length - 1)
                ans.append(intrm).append(" ");
            if (i == strings.length - 1)
                ans.append(intrm);
        }

        return ans.toString();

    }
}