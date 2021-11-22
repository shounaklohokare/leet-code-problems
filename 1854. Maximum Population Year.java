class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int[] years = new int[2051];
        
        for(int[] log : logs){
            years[log[0]]+=1; // if born +1
            years[log[1]]-=1; // if die -1
        }
        
        int cnt=0;            // num of people alive at instance
        int result=0;         // earliest year with max population
        int max = Integer.MIN_VALUE; // max population
        
        for(int i=1950; i<2051; i++){
            
            cnt+=years[i];
            
            if(cnt>max){  
                max=cnt;
                result=i;
            }
    
        }
        
        return result;
    
    }
}
