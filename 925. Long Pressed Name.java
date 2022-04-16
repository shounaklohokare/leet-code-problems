class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, m = name.length(), n = typed.length();
        // here i is a pointer for name
        // whereas j is a pointer for typed
        for (int j = 0; j < n; j++) { // iterating typed using for loop (using it's pointer j)
            if (i < m && name.charAt(i) == typed.charAt(j))
                i++; // if char at name is equals to char at typed then increment pointer for name
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
                return false; // if they are not equal then check j is at zero or (check whether the prev and
                              // current character of typed are inequal) if inequal then the name is not long
                              // pressed hence return false
        }

        return i == m; // if name is succesfully iterated using pointer i then it is long pressed hence
                       // return true
        // because if it weren't long pressed it would have been picked up by the else
        // if condition

    }
}