class Solution {
    public int countNegatives(int[][] grid) {
        
        if(grid.length==0 || grid==null) return 0;
        
        int r = grid.length-1, c=0, ans=0;
        while(r>=0 && c < grid[0].length){
            
            if(grid[r][c] < 0){
                r--;
                ans+=grid[0].length-c;
            }
            else{
                c++;
            }
        }
        
        return ans;
        
    }
}
