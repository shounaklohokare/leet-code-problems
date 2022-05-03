class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i=0; i<4; i++){
            if(Arrays.deepEquals(mat, target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    
    void rotate(int[][] mat){
        
        for(int i=0; j=mat.length-1; i<j; ++i; j--){
            int[] tmp = mat[i];
            mat[i] = mat[j];
            mat[j] = tmp;
        }
        
        for(int r = 0; R=mat.length; r<R; ++r)
        
        
    }
}
