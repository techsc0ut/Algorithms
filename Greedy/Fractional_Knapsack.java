class Solution {
    
    double fractionalKnapsack(int W, Item arr[], int n) {
        
        Arrays.sort(arr, new comp());
        
        double maxProfit = 0;
        
        for(Item i : arr){
            
            if(W > 0){
                
                if(W >= i.weight){
                    
                    maxProfit += i.value;
                    W = W - i.weight;
                    
                }else{
                    
                    double currProfit = (double) (i.value / ((1.0) * i.weight)) * W;
                    maxProfit += currProfit;
                    W = 0;
                    
                }
                
            }
            
        }
        
        return maxProfit;
    
    }
}

class comp implements Comparator<Item> {
    
    public int compare(Item a1, Item a2) {
        
        double a = (a1.value/((1.0) * a1.weight));
        
        double b = (a2.value/((1.0) * a2.weight));
        
        if(b > a){
            
            return 1;
        }     
        
        return -1;
    }
}
