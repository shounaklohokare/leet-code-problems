class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int out = 0; /// out variable to count number of odd numbers

        int[][] arr = new int[m][n]; // array

        for (int[] index : indices) { // taking one index array at a time

            for (int i = 0; i < index.length; i++) { // iterating it

                if (i == 0) { // if index is 0 then we have to increment the

                    int ri = index[i]; // hence take ri value

                    for (int j = 0; j < n; j++) { // iterate the columns
                        arr[ri][j]++; // increment all the columns by keeping row constant
                    }

                }
                if (i == 1) { // if i is 0 then increment columns

                    int ci = index[i]; // take columns at ci

                    for (int j = 0; j < m; j++) { // iterate the rows
                        arr[j][ci]++; // increment the each row by keeping column constant
                    }
                }
            }

        }

        for (int[] a : arr) {
            for (int x : a) { // iterate the whole matrix
                if (x % 2 != 0)
                    out++; // if the value is odd increment out by 1
            }
        }

        return out;

    }
}