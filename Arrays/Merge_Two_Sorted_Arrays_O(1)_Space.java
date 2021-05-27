class Solution{
    static int nextGap(int gap){
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
    public static void merge(long ar1[], long ar2[], int n, int m) {
        int org=n+m;
	    int gap=nextGap(org);
	    while(gap!=0){
	        int i=0,j=gap;
	        while(i<org && j<org){
	            if(i<n && j<n){
	                if(ar1[i]>ar1[j]){
	                    swap(ar1,i,ar1,j);
	                    i++;j++;
	                }else{
	                    i++;j++;
	                }
	            }else if(i<n && j>=n && j<org){
	                int ind=j-n;
	                if(ar1[i]>ar2[ind]){
	                    swap(ar1,i,ar2,ind);
	                    i++;j++;
	                }else{
	                    i++;j++;
	                }
	            }else if(i>=n && j>=n && i<org && j<org){
	                int ind1=i-n,ind2=j-n;
	                if(ar2[ind1]>ar2[ind2]){
	                    swap(ar2,ind1,ar2,ind2);
	                    i++;
	                    j++;
	                }else{
	                    i++;j++;
	                }
	            }else{
	                break;
	            }
	        }
	        gap=nextGap(gap);
	    }    
    }
    static void swap(long ar1[],int a,long ar2[],int b){
	    long temp=ar1[a];
	    ar1[a]=ar2[b];
	    ar2[b]=temp;
	}
}
