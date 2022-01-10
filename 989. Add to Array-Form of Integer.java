class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> al = new ArrayList<>();
        
        int i = num.length;
        int curr = k;
        while(--i >=0 || curr > 0){
            if(i>=0){
                curr+=num[i];
            }
            
            al.add(curr%10);
            curr/=10;
        }
        
        Collections.reverse(al);
        return al;
        
    }
}
