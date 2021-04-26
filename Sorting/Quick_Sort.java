public class Quick_Sort{	
	public static void main(String[] args){
		int ar[]= {111111,-9,-1299,-8,-3,-8,-4};
		quicksort(ar,0,ar.length-1);
		for(int h:ar){
			System.out.print(h+" ");
		}
	}
	public static void quicksort(int ar[],int start,int end){
		if(start<end){
			int part=partition(ar,start,end);
			quicksort(ar,start,part-1);
			quicksort(ar,part+1,end);
		}
	}
	public static int partition(int [] ar,int start,int end){	
		int pivot=ar[end];
		int i=start-1;
		int temp;
		for(int j=start;j<=end-1;j++){
			if(pivot>=ar[j]){
				i+=1;
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		temp=ar[i+1];
		ar[i+1]=ar[end];
		ar[end]=temp;
		return i+1;
	}
}


