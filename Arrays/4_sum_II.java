class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        HashMap<Integer,Integer> H=new HashMap();
        for(int i:nums1){
            for(int j:nums2){
                Integer x=H.get(i+j);
                if(x!=null){
                    H.put((i+j),x+1);
                }else{
                    x=1;
                    H.put((i+j),x);
                }
            }
        }     
        int v=0;
        for(int p:nums3){
            for(int q:nums4){
                Integer c=H.get(-(p+q));
                if(c!=null){
                    v+=c;
                }
            }
        }
       
        return v;
    }
}
