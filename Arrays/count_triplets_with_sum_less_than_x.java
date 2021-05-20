class Solution{
    long countTriplets(long arr[], int n,int sum){
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int a=i+1;
            int b=n-1;
            while(a<b){
                long h=arr[i]+arr[a]+arr[b];
                if(h>=sum){
                    b--;
                }else{
                    count+=(b-a);
                    a++;
                }
            }
        }
        return count;
    }
}
