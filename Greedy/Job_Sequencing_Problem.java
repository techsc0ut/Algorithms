class Solution{
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,new comp());
        int maxCap=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxCap=Math.max(maxCap,arr[i].deadline);
        }
        int cap[]=new int[maxCap];
        Arrays.fill(cap,-1);int profit=0,count=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline-1;j>=0;j--){
                if(cap[j]==-1){
                    count++;
                    cap[j]=0;
                    profit+=arr[i].profit;
                    break;
                }
            }
        }
        int ans[]=new int[2];
        ans[0]=count;
        ans[1]=profit;
        return ans;
    }
}
class comp implements Comparator<Job>{
    public int compare(Job J1,Job J2){
        return J2.profit-J1.profit;
    }
}
