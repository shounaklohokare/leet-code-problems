class Solution {
    public int romanToInt(String s) {
      
        Map<Character, Integer> mp = new HashMap<>();
        
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        
        int current=0; int prev=0;
        int n = s.length()-1;
        
        int ans=mp.get(s.charAt(n));
        for(int i=n; i>0; i--){
            
            prev = mp.get(s.charAt(i-1));
            current = mp.get(s.charAt(i));
            
            if(prev>=current) ans+=prev;
            else ans-=prev;
        }return ans;
        
        
    }
}
