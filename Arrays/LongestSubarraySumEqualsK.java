
class Solution{
    
    public static int lenOfLongSubarr (int A[], int N, int K) {
        
        int maxLen = 0, sum = 0;
        
        HashMap<Integer, Integer> Map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            
            sum += A[i];
            
            if(sum == K){
                
                maxLen = i + 1;  
                
            }
            
            if(Map.containsKey(sum - K)){
                
                maxLen = Math.max(maxLen, i - Map.get(sum - K));
                
            }
                
             
            if(Map.get(sum) == null){
                
                Map.put(sum, i);
        
            }
                
        }
        
        return maxLen;
    }
    
}
