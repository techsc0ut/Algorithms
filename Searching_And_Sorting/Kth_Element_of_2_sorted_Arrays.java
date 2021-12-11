class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {  
        int low=Math.max(0,k-m) , high=Math.min(k,n);
        while(low<=high){
            int part1=(low+high)/2;
            int part2=k-part1;
            int a1=(part1==0)?Integer.MIN_VALUE:arr1[part1-1];
            int b1=(part1==n)?Integer.MAX_VALUE:arr1[part1];
            int a2=(part2==0)?Integer.MIN_VALUE:arr2[part2-1];
            int b2=(part2==m)?Integer.MAX_VALUE:arr2[part2];
            if(a1<=b2 && a2<=b1){
                return Math.max(a1,a2);
            }else if(a1>b2){
                high=part1-1;
            }else{
                low=part1+1;
            }
        }
        return -1;
    }
}
