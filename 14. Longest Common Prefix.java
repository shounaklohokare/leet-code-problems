class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";

        String prefix = strs[0]; // keeping the first word of the array as the initial prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // indexOf returns zero if the substring is at the start of the
                                                   // string, thus this while loop reduces the length of the prefix by
                                                   // one even if a single element in the given string array does not
                                                   // return 0 i.e
                                                   // indexOf operation does not return 0
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;

    }
}