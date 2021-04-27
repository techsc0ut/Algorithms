class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n){
        Set<Integer> S=new HashSet();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(S.contains(sum) || sum==0){
                return true;
            }else{
                S.add(sum);
            }
        }
        return false;
    }
}
