class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sblder = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // takes care of columnNumber equals to 26 (edgecase)
            sblder.insert(0, (char) ((columnNumber % 26) + 'A')); // takes modulus of columnNumber by 26 and converts it
                                                                  // to character and adds it to first index of sblder
            columnNumber /= 26; // divides columnNumber by 26
        }

        return sblder.toString();

    }
}