/** ALGORITHM :
  1.make all odd elements multiply by 2.
  2.find the max and min.
  3.store diff=max-min.
  4.now until the max is even, keep dividing he max by 2, and get minimzed result.
**/
class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> PQ=new PriorityQueue<>((a,b)->(b-a));// MAX HEAP.
        
        int ans=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int x:nums){
            if(x%2==1) x*=2;// IF NUMBER IS ODD, MULTIPLY BY 2.
            if(min>x) min=x;// FINDING THE MINIMUM.
            PQ.add(x);
        }
        
        while(PQ.peek()%2==0){
            int max=PQ.remove();
            ans=Math.min(ans,max-min);
            min=Math.min(min,max/2);
            PQ.add(max/2);
        }
        
        return Math.min(ans,PQ.peek()-min);
    }
}
