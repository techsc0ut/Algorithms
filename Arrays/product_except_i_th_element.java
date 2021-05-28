class Solution { 
	public static long[] productExceptSelf(int nums[], int n){ 
       long[] dp=new long[n];
       for(int i=0;i<n;i++){
           dp[i]=1;
       }
       long temp=1;
       for(int i=0;i<n;i++){
           dp[i]=temp;
           temp*=nums[i];
       }
       temp=1;
       for(int i=n-1;i>=0;i--){
           dp[i]*=temp;
           temp*=nums[i];
       }
       return dp;
	} 
} 
