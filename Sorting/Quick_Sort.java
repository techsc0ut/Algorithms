public class Quick_Sort{	
	public static void main(String[] args){
		int ar[]= {111111,-9,-1299,-8,-3,-8,-4};
		quicksort(ar,0,ar.length);
		for(int h:ar){
			System.out.print(h+" ");
		}
	}
	public static void quicksort(int ar[],int start,int end){
		if(end-start<2){
			return;
		}
		int pivotindex=partition(ar,start,end);
		quicksort(ar,start,pivotindex);
		quicksort(ar,pivotindex+1,end);
	}
	public static int partition(int [] ar,int start,int end){	
		int i=start;
		int j=end;
		int pivot=ar[i];
		while(i<j){
			while(i<j && ar[--j]>=pivot);
			if(i<j){
				ar[i]=ar[j];
			}
			while(i<j && ar[++i]<=pivot);
			if(i<j){
				ar[j]=ar[i];
			}
		}
		ar[j]=pivot;
		return j;
	}
}


