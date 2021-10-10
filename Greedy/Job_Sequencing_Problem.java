class Solution{
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i].deadline){
                max=arr[i].deadline;
            }
        }
        int profit=0;
        int count=0;
        int res[]=new int[max+1];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(res[j]==-1){
                    count++;
                    profit+=arr[i].profit;
                    res[j]++;
                    break;
                }
            }
        }
        int Res[]=new int[2];
        Res[0]=count;
        Res[1]=profit;
        return Res;
    }
}
