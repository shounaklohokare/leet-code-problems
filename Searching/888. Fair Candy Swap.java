class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int dif = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;
        
        Set<Integer> set = new HashSet<>();
        
        for(int a : aliceSizes) set.add(a);
        
        for(int b : bobSizes) if(set.contains(b+dif)) return new int[] {b+dif, b};
        
        return new int[0];
        
    }
}
