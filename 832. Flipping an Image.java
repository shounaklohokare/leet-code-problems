class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int[][] answer = new int[image.length][];
        
        for(int i=0; i<image.length; i++){
            
            int[] rev = new int[image[i].length];
            
            for(int j=0; j<image[i].length; j++){
                int num = image[i][rev.length-j-1];
                if(num==1) rev[j] = 0;
                else rev[j]=1;
            }
            
            answer[i] = rev;
            
        }
        
        return answer;
        
    }
}
