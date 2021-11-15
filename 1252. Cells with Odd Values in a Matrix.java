class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       // Initialising Array with Number of ROWS m and Number of Columns n
        int[][] arr = new int[m][n];

        // Iterate Over Indices Array
        for (int[] row : indices) { // loop For Every ROW
            for (int i = 0; i < row.length; i++) {   // For For Columns in the ROW
                // if i=0 we will get ri
                if (i == 0) {
                    int ri = row[i];
                    // Now for this ROW index in ARRAY increment Values by 1
                    for (int j = 0; j < n; j++) { // j -> For Iterating Over Columns
                        arr[ri][j] += 1;    // Incrementing the Elements
                        // Here ri --> IS FIXED it means for a Particular ROW increment Elements by 1
                    }
                } else if (i == 1) {
                    // Now if i= 1 we will get ColumnIndex (i.e ci )
                    int ci = row[i];
                    // For this Column Index in ARRAY increment Values BY 1
                    for (int j = 0; j < m; j++) {  // j -> For Iterating Over Rows
                        arr[j][ci] += 1;  // Incrementing the Elements
                        // Here ci -> IS FIXED it means for a Particular Column Increment Elements by 1
                    }
                }
            }
        }
        // Now Initially take Count of ODD elements as 0
        int count = 0;
        // Iterate Over Array
        for (int[] row : arr) {  // For Every ROW
            for (int j : row) {    // Iterate Over Columns
                if (j % 2 != 0) {   // If Element in ROW at index i is ODD (i.e Not Divisible by 2)
                    count++;            // Increment the COUNT
                }
            }
        }
        // At the END Return the Total Count of Odd Elements
        return count;
    }
}
