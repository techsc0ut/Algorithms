class Solution{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> res=new ArrayList<>();
        int i=0, j=0 , sum=0; 
        while(i<n){
            while(sum<s && i<n){
                sum+=arr[i++];
            }
            while(sum>s && j<i){
                sum-=arr[j++];
            }
            if(sum==s){
                res.add(j+1);
                res.add(i);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
© 2021 GitHub, Inc.
