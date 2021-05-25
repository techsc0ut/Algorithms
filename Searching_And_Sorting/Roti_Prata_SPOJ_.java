 static boolean IsPossible(int ar[],int prata,int mid){
        int time=0;
        int p=0;
        int n=ar.length;
        for(int i=0;i<n;i++){
            time=ar[i];
            int j=2;
            while(time<=mid){
                p++;
                time+=(ar[i]*j);
                j++;
            }
            if(p>=prata){
                return true;
            }
        }
        return false;
    } 
	public static int func(int ar[],int prata){
	    int n=ar.length;
	    Arrays.sort(ar);
	    int max=ar[n-1];
	    int start=0;
	    int end=calc(max,prata);
	    int ans=Integer.MAX_VALUE;
	    while(start<=end){
	        int mid=(start+end)/2;
	        if(IsPossible(ar,prata,mid)){
	            ans=Math.min(ans,mid);
	            end=mid-1;
	        }else{
	            start=mid+1;            
	        }
	    }
	    return ans;
	}
	static int calc(int R,int P){
	    int sum=0;
	    for(int i=1;i<=P;i++){
	        sum+=i*R;
	    }
	    return sum;
	}
