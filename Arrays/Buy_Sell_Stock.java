class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=-1;
        int profit=0;
        int ind=-1;
        int ind2=-1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i]; 
                sell=prices[i];
                ind=i;
            }         
            if(sell<prices[i]){
                sell=prices[i];
                ind2=i;
            }
            if(ind2>=ind){
                profit=Math.max(sell-buy,profit);   
            }
        }
        return profit;
    }
}
