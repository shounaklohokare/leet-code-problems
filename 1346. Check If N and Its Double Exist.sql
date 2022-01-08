class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            

            
            int target = arr[i] * 2;
            int x = binarySearch(arr, target);
            if(x!=-1 && x!=i){
                return true;
            }
        }
        
        return false;
    }
    
    int binarySearch(int arr[], int target){
        
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo<=hi){
            
            int mid = lo + (hi - lo ) / 2;
            
            if(arr[mid]==target){
                return mid;
            }
            
            else if(arr[mid] < target){
                lo = mid + 1;
            }
            
            else {
                hi = mid - 1;
            }
            
        }
        
        return -1;
        
    }
}
