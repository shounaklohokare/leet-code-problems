class Solution {
    public int diagonalSum(int[][] mat) {
        
        int primDiag = 0;
        int secDiag = 0;
        
        
        int n1 = mat[0].length;
        
        int n = mat.length;
        int toDec = mat[n/2][n/2];
        
        
        
        for(int i=0; i<n; i++){
            primDiag+=mat[i][i];
            secDiag+=mat[i][n-i-1];
        }
        
        
        return n1%2== 0 ? (primDiag+secDiag)  : (primDiag+secDiag)-toDec;
        
    }
}
