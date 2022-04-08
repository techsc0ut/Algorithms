class KthLargest {
    int k;
    PriorityQueue<Integer> PQ;
    public KthLargest(int _k, int[] nums) {
        k=_k;
        PQ=new PriorityQueue<>(k);
        for(int x:nums){
            PQ.offer(x);
            if(PQ.size()>k){
                PQ.poll();
            }
        }
    }
    
    public int add(int val) {
        PQ.offer(val);
        while(PQ.size()>k){
            PQ.poll();
        }
        return PQ.peek();
    }
}
