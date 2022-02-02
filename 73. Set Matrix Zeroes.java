class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isRowFirstZero= false;
        boolean isColFirstZero = false;
        for(int i=0;i<matrix.length;i++) // checks whether if there is a zero in the first column
        {
            if(matrix[i][0]==0)
                isColFirstZero=true;    // if yes assign isColFirstZero to true
        }
        for(int i=0;i<matrix[0].length;i++) // checks if there is a zero in the first row
        {
            if(matrix[0][i]==0)      
                isRowFirstZero=true;      // if yes assign isRowFirstZero to true
        }
        
        for(int i=1;i<matrix.length;i++) 
        {
            for(int j=1;j<matrix[0].length;j++)   // iterate over all the cells except those in first row and first column
            {
                if(matrix[i][j]==0)        // if any of those cells is zero 
                {
                    matrix[i][0]=0;       // assign zero to its neighboring north and west cells 
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++)   // iterate over all the cells except those in first row and first column
        {
            for(int j=1;j<matrix[0].length;j++) 
            {
                if(matrix[i][0]==0)   // if first element in that row is zero
                    matrix[i][j]=0;   // then assign zero to that element
                else if(matrix[0][j]==0) // if first element of that column is zero
                    matrix[i][j]=0;   // then assign zero to that element
            }
        }
        
        if(isRowFirstZero==true)         // check if there is zero in first row 
        {
           for(int i=0;i<matrix[0].length;i++)   // if yes assign all elements of first row to zero
              matrix[0][i]=0;                                
        }
       if(isColFirstZero==true)                  // check if there is zero in first column
       {
           for(int i=0;i<matrix.length;i++)      // if yes assign all elements of first columns to zero
               matrix[i][0]=0;                              
       }
    }
}
