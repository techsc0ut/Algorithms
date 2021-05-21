class Solution{
    public int minSwaps(int nums[]){
        int n=nums.length;
        HashMap<Integer,Integer> H=new HashMap();
        int [] temp=Arrays.copyOfRange(nums,0,n);
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            H.put(nums[i],i);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=temp[i]){
                int buf=nums[i];
                count++;
                swap(nums,i,H.get(temp[i]));
                
                H.put(buf,H.get(temp[i]));
                H.put(temp[i],i);
            }
        }
        return count;
    }
    public void swap(int ar[],int a,int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
}
