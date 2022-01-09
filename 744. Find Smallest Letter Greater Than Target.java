class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int lo = 0;
        int hi = letters.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(target < letters[mid]) hi = mid-1;
            
            else lo = mid+1;

        }
        
        return letters[lo%letters.length];
        
    }
}
