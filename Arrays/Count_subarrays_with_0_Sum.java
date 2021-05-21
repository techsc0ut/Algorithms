class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) {
        HashMap<Long,Long> H=new HashMap();
        long count=0;
        long prefix=0;
        for(int i=0;i<n;i++){
            prefix+=arr[i];
            if(prefix==0){
                count++;
            }
            Long c=H.get(prefix);
            if(c!=null){
                count+=c;
                H.put(prefix,c+1);
            }else{
                long a=1;
                H.put(prefix,a);
            }
        }
        return count;
    }
}
