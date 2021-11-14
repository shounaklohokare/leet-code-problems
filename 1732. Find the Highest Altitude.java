class Solution {
    public int largestAltitude(int[] gain) {
        
        int currentGain = 0;
        int answer=0;
        
        for(int ele : gain){
            
            currentGain+=ele;
            
            if(currentGain > answer) answer = currentGain;
            
        }
        
        return answer;
        
        
    }
}
