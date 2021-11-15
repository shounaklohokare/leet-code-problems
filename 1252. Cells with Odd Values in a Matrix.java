class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[][] arr = new int[m][n];
        
        for(int[] row : indices){
            
            for(int i=0; i<row.length; i++){
                
                if(i==0){     // if i==0 we are iterating row in indices
                    
                    int ri = row[i];
                    
                    for(int j=0; j<n; j++){  // by n we are just iterating rows in arr
                        arr[ri][j]+=1;
                    }   
                }
                
                if(i==1){
                    
                    int rj = row[i];
                    
                    for(int j=0; j<m; j++){
                        arr[j][rj]+=1;
                    }
                }
            }
        }
        
        
        int count=0;
        for(int[] row : arr){
            
            for(int j : row){
                if(j%2!=0) count++;
            }
            
        }
        
        return count;
        
        
    }
}
