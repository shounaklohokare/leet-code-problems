class Solution {
    public int[][] generateMatrix(int n) {
        
        int rowBegin = 0;
        int rowEnd = n-1;
        
        int colBegin = 0;
        int colEnd = n-1;
        
        int pntr = 1;
        
        int[][] ans = new int[n][n];
        
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
            for(int j=colBegin; j<=colEnd; j++) ans[rowBegin][j] = pntr++;
            
            rowBegin++;
            
            for(int j=rowBegin; j<=rowEnd; j++) ans[j][colEnd] = pntr++;
            
            colEnd--;
            
            if(rowBegin <= rowEnd){
                 for(int j=colEnd; j>=colBegin; j--) ans[rowEnd][j] = pntr++;
            }
            
            rowEnd--;
            
            if(colBegin <= colEnd){
                for(int j=rowEnd; j>=rowBegin; j--) ans[j][colBegin] = pntr++;
            }
            
            colBegin++;
            
        }
        
        return ans;
        
    }
}
