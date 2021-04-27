import java.util.*;
public class Merge_sort{
	public static void mergesort(int [] ar,int start,int end){
		if(start<end){
			int mid=(start+end)/2;
			mergesort(ar,start,mid);
			mergesort(ar,mid+1,end);
			merge(ar,start,mid,end);
		}
	}	
	public static void merge(int [] ar,int start,int mid,int end){
		int i=0,j=0;
		int index=start;
		int [] left=Arrays.copyOfRange(ar,start,mid+1);
		int [] right=Arrays.copyOfRange(ar,mid+1,end+1);
		while(i<left.length && j<right.length){
			if(left[i]>right[j]){
				ar[index++]=right[j++];
			}else{
				ar[index++]=left[i++];
			}
		}
		while(i<left.length){
			ar[index++]=left[i++];
		}
		while(j<right.length){
			ar[index++]=right[j++];
		}
		
		
	}
	public static void main (String[] args){
		int ar[]= {12,123,1212,212,2121};
		mergesort(ar,0,ar.length-1);
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
}

