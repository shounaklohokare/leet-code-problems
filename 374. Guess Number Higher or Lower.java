/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int start = 0;
        int end = n;
        
        while(start <= end){
        
            int mid = start + (end-start)/2;
            int out = guess(mid);
        
            if(out==-1) end = mid-1;
        
            else if(out==1) start=mid+1;
        
            else return mid;
        }
        
        return -1;
        
    }

}
