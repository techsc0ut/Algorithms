// O(n^2) worst case  , O(n) AVg case , O(1) Space.
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        if (k > 0 && k <= r - l + 1) {
            int pos = partition(arr,l,r);
            if (pos - l == k - 1)
                return arr[pos];
            if (pos - l > k - 1)
                return kthSmallest(arr, l, pos - 1, k);
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }
        return Integer.MAX_VALUE;
    } 
    static int partition(int ar[],int start,int end){
        int pv=ar[end];
        int index=start-1;
        for(int i=start;i<=end-1;i++){
            if(ar[i]<=pv){
                index++;
                int t=ar[index];
                ar[index]=ar[i];
                ar[i]=t;
            }
        }
        int t=ar[end];
        ar[end]=ar[index+1];
        ar[index+1]=t;
        return index+1;
    }
}
