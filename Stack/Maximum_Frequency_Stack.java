class FreqStack {
    Map<Integer,LinkedList<Integer>> St;
    Map<Integer,Integer> Freq;
    int maxFreq;
    public FreqStack() {
        maxFreq=0;
        St=new HashMap<>();
        Freq=new HashMap<>();
    }
    
    public void push(int val) {
        int currFreq=Freq.getOrDefault(val,0);
        currFreq++;
        Freq.put(val,currFreq);
        if(St.get(currFreq)==null){
            St.put(currFreq,new LinkedList<>());
        }
        St.get(currFreq).addFirst(val);
        maxFreq=Math.max(maxFreq,currFreq);
    }
    
    public int pop() {
        int ans=St.get(maxFreq).removeFirst();
        int currFreq=Freq.get(ans);
        currFreq--;
        Freq.put(ans,currFreq);
        if(St.get(maxFreq).size()==0){
            maxFreq--;
        }
        return ans;
    }
}

