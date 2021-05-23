class Solution {
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m){
        // More Students then Books , return -1 
        // Since each Each student has to be allocated at least one book.
        if(n<m){
            return -1;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        // Min Books will be 0 and Max Books will be total Books . 
        int start=0,end=sum,ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(IsPossible(a,n,m,mid)){
                ans=Math.min(ans,mid);
                end=mid-1;
            }else{
                start=mid+1;// 
            }
        }
        return ans;
    }
    public static boolean IsPossible(int ar[],int n,int m,int mid){
        int cursum=0;
        int stud=1;
        for(int i=0;i<n;i++){
            if(ar[i]>mid){
                return false;
            }
            if(ar[i]+cursum>mid){
                stud++;
                cursum=ar[i];
                if(stud>m){
                    return false;
                }
            }else{
                cursum+=ar[i];
            }
        }        
        return true;
    }
}
