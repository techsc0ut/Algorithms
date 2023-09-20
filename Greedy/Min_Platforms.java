class Solution {
    
    static int findPlatform(int arr[], int dep[], int n) {
        
        int platformRequired = 1;
        int currentPlatforms = 1;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 1, j = 0;
        
        while(i < n && j < n){
            
            if(arr[i] <= dep[j]){
                
                i++;
                currentPlatforms++;
                
            }else{
                
                j++;
                currentPlatforms--;
                
            }
            
            if(platformRequired < currentPlatforms){
                
                platformRequired = currentPlatforms;
                
            }
            
        }
        
        return platformRequired;
        
    }
}

