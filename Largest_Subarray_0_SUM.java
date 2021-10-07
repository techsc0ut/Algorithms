class GfG{
    int maxLen(int arr[], int n){   
        int ans=0;
        HashMap<Integer,Integer> H=new HashMap<>();
        int preFix=0;
        for(int i=0;i<n;i++){
            preFix+=arr[i];
            if(preFix==0){
                ans=i+1;
            }else{
                Integer x=H.get(preFix);
                if(x==null){
                    H.put(preFix,i);
                }else{
                    ans=Math.max(ans,i-x);
                }
            }
        }return ans;
    }
}
