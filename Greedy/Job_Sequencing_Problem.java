class Solution {
    
    int [] JobScheduling(Job arr[], int n) {
        
        int maxDeadline = -1;
        
        for(int i = 0; i < n ; i++){
            
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
                
        }
        
        int timeSlots[] = new int[maxDeadline + 1];
       
        Arrays.fill(timeSlots, -1);
        
        Arrays.sort(arr, (j1, j2) -> (j2.profit - j1.profit));
        
        int maxProfit = 0, jobCount = 0;
        
        for(int i = 0; i < n; i++){
            
            for(int j = arr[i].deadline; j > 0; j--){
                
                if(timeSlots[j] == -1){
                    
                    maxProfit += arr[i].profit;
                    timeSlots[j] = 1;
                    jobCount++;
                    
                    break;
                }
                
            }
            
        }
        
        int result[] = new int[2];
        result[0] = jobCount;
        result[1] = maxProfit;
        
        return result;
        
    }
}
