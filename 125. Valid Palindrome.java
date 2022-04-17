class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]", "").toUpperCase(); // replace all non-alphanumeric characters with blank

        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
                return false;
        }
        return true;
    }
}

///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
class Solution_ {
    public boolean isPalindrome(String s) {

        if (s.isEmpty())
            return true;

        int head = 0, tail = s.length() - 1;

        char cHead, cTail;

        while (head <= tail) {

            cHead = s.charAt(head);
            cTail = s.charAt(tail);

            if (!Character.isLetterOrDigit(cHead))
                head++;

            else if (!Character.isLetterOrDigit(cTail))
                tail--;

            else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail))
                    return false;
                head++;
                tail--;
            }

        }

        return true;

    }
}