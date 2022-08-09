class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
        Arrays.sort(arr);
        int mod=(int)Math.pow(10,9)+7;
        long count=1;
        HashMap<Integer,Long> H=new HashMap<>();
        H.put(arr[0],count);
        
        for(int i=1;i<arr.length;i++){
            
            count=1;
            for(Integer n:H.keySet()){
                if(arr[i]%n==0 && H.containsKey(arr[i]/n)){
                    count+=(H.get(n)*H.get(arr[i]/n));
                }
            }
            
            H.put(arr[i],count);
        }
        
        long sum=0;
        for(Integer n:H.keySet()){
            sum = (sum + H.get(n)) % mod ;
        }
        
        return (int)sum;
    }
}
