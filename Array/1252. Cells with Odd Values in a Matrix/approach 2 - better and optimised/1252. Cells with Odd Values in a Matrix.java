class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[] row = new int[m]; // declare seperate array for row
        int[] col = new int[n]; // declare seperate array for column

        for (int[] index : indices) { // iterate individual array of 'index' from multi dimensional 'indices'
            row[index[0]]++; // increment row at the index of 'index[0]' as the 0th pos has the row value
            col[index[1]]++; // increment col at the index of 'index[1]' as the 1st pos has the column
        }

        int out = 0;
        for (int i = 0; i < m; i++) { // iterate num of rows using i
            for (int j = 0; j < n; j++) { // iterate num of cols using j
                if ((row[i] + col[j]) % 2 != 0)
                    out++; // if we add the i th value of row to jth value of col
                // we get the the element that would be at a proper 2 dimensional array
                // if it is odd we increment the counter variable 'out
            }
        }

        return out;

    }
}