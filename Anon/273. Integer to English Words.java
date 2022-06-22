class Solution {
    public String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        String words = "";

        String[] ones = { "zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

        String[] tens = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

        if ((num / 1000000000) > 0) {
            words += " " + numberToWords(num / 1000000000) + " Billion";
            num %= 1000000000;
        }

        if ((num / 1000000) > 0) {
            words += " " + numberToWords(num / 1000000) + " Million";
            num %= 1000000;
        }

        if ((num / 1000) > 0) {
            words += " " + numberToWords(num / 1000) + " Thousand";
            num %= 1000;
        }

        if ((num / 100) > 0) {
            words += " " + numberToWords(num / 100) + " Hundred";
            num %= 100;
        }

        if (num > 0) {

            if (num < 20) {
                words += " " + ones[num];
            } else {

                words += " " + tens[num / 10];

                if ((num % 10) > 0) {
                    words += " " + ones[num % 10];
                }

            }

        }

        return words.strip();
    }
}