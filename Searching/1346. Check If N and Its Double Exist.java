class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        
        int n = arr.length;
        for(int i=0; i<n; i++){
            
            int target = arr[i] * 2;
            
            int x = binarySearch(arr, target);
            
            if(x!=i && x!=-1)  return true;
            
        }
        
        return false;
        
    }
    
    int binarySearch(int[] arr, int target){
        
        int lo = 0;
        int hi = arr.length - 1;
        
        while(lo <= hi){
            
            int mid = lo + (hi-lo) / 2;
            
            if(arr[mid]==target) return mid;
            
            if(arr[mid] < target) lo = mid+1;
            
            else hi = mid - 1;
            
        }
        
        return -1;
        
    }
}
