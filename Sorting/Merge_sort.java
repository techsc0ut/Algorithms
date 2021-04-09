public class Merge_sort{
	public static void mergesort(int [] ar,int start,int end){
		if(end-start<2){
			return;
		}
		int mid=(start+end)/2;
		mergesort(ar,start,mid);
		mergesort(ar,mid,end);
		merge(ar,start,mid,end);
	}	
	public static void merge(int [] ar,int start,int mid,int end){
		if(ar[mid-1]<=ar[mid]){
			return;
		}
		int i=start;
		int j=mid;
		int tmpindex=0;
		int [] tmp=new int[end-start];
		while(i<mid && j<end)//HERE WE HAVE NOT USE "<=" SINCE IN LEFT ARRAY HAS THE LAST INDEX "MID-1" AND THE SECOND ARRAY HAS THE END INDEX "END-1"
		{	
			tmp[tmpindex++]=(ar[i]<=ar[j])?ar[i++]:ar[j++];
		}
		System.arraycopy(ar, i, ar, start+tmpindex,mid-i);
		System.arraycopy(tmp,0,ar,start,tmpindex);
	}
	public static void main (String[] args){
		int ar[]= {12,123,1212,212,2121};
		mergesort(ar,0,ar.length);
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
}

