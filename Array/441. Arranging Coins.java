class Solution {
    public int arrangeCoins(int n) {
        
        int stepsize = 1;         // intilaise the rowlength or stepsize if 1
        while(n-stepsize >= 0){         // if n - stepsize < 0 then zero then the row is not getting  completed and hence we break the loop
                n-=stepsize;            // we decrement n by step size at iteration
                stepsize++;             // and increment the stepsize as well at each iteration
        }
        
        return stepsize-1;              // we return stepsize - 1
        
        
    }
}