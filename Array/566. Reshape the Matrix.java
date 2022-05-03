class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        if(n*m!=r*c) return mat;
        
        int[][] ans = new int[r][c];
        
        int row_p=0;
        int col_p=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[row_p][col_p]=mat[i][j];
                col_p++;
                if(col_p==c){
                    col_p=0;
                    row_p++;
                }
            }
        }
        
        return ans;
        
    }
}
