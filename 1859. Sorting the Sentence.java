class Solution {
    public String sortSentence(String s) {

        String[] str = s.split(" ");
        String[] res = new String[str.length];

        StringBuilder sblder = new StringBuilder();

        int i;
        for (String x : str) {
            i = (int) x.charAt(x.length() - 1) - '0'; // '0' stands for ASCII value of character i.e 48 which converts
                                                      // the char number into appropriate integer value for e.g '9' -'0'
                                                      // = 9

            res[i - 1] = x.substring(0, x.length() - 1);
        }

        for (i = 0; i < res.length - 1; i++) {
            sblder.append(res[i]).append(" ");
        }

        sblder.append(res[i]);

        return sblder.toString();
    }
}