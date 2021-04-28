class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
      long minn=arr[0];
      long maxp=arr[0];
      long ans=arr[0];
      for(int i=1;i<n;i++){
          if(arr[i]<0){
                long temp=minn;
                minn=maxp;
                maxp=temp;
          }
          maxp=Math.max(arr[i],maxp*arr[i]);
          minn=Math.min(arr[i],minn*arr[i]);
          ans=Math.max(ans,maxp);
      }
      return ans;
    }
}
