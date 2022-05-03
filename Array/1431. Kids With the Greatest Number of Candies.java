class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> al = new ArrayList<>();
        
        for(int i=0; i<candies.length; i++){
            
            int greatestCandies = candies[i]+extraCandies;
            boolean flag=true;
            
            for(int j=0; j<candies.length; j++){
                
                if(greatestCandies < candies[j]){
                    flag=false;
                    break;
                }
                
                
            }
            al.add(flag);
        }
        return al;
        
        
    }
}
