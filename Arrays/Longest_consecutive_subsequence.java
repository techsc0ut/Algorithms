class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N){
	   // add your code here
	   int [] a=new int[100001];
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<N;i++){
	       max=Math.max(max,arr[i]);
	       a[arr[i]]=1;
	   }
	   int n=a.length;
	   int count=0;
	   int ans=0;
	   for(int j=0;j<max+1;j++){
	       if(a[j]>0){
	           count++;
	       }else{
	           count=0;
	       }
	       ans=Math.max(ans,count);
	   }
	   return ans;
	}
}
