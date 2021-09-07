class Solution:
    def reverse(self, x: int) -> int:
        
        rev = str(abs(x))[::-1]
        
        rev = int(rev)
        
        if rev > 2**31-1 or rev < -2 ** 31-1:
            return 0
        
        if x < 0:
            return -1 * rev
        
        return rev
