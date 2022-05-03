class Solution {
    public boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1; // i pointer from which will be incremented whereas j is a pointer from the end
                                       // which will be decremented

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                // if there is an instance where the character at i are not equal to that of j
                // then we check whether the string is a palindrome by skipping one character
                // from the start or by skipping one character from the end
                return (isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1));
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}