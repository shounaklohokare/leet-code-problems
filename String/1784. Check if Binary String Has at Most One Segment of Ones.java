class Solution {
    public boolean checkOnesSegment(String s) {

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                return checkIfOneExists(s, i + 1);
            }
        }

        return true;

    }

    private boolean checkIfOneExists(String s, int j) {

        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                return false;
        }

        return true;

    }
}