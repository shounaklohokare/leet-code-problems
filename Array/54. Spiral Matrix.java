class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> al = new ArrayList<>();
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
            for(int j=colBegin; j<=colEnd; j++) al.add(matrix[rowBegin][j]); // Traverse right
            
            rowBegin++;
            
            for(int j=rowBegin; j<=rowEnd; j++) al.add(matrix[j][colEnd]);   // Traverse down
            
            colEnd--;
            
            if(rowBegin <= rowEnd){
                
                for(int j=colEnd; j>=colBegin; j--) al.add(matrix[rowEnd][j]);  // Traverse left
                
            }
            
            rowEnd--;
            
            if(colBegin <= colEnd){
                
                for(int j=rowEnd; j>=rowBegin; j--) al.add(matrix[j][colBegin]);  // Traverse Up
                
            }
            
            colBegin++;
            
            
        }
        
        return al;
    }
}
