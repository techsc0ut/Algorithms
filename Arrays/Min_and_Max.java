import java.util.*;
public class Min_and_Max{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Min_and_Max p=new Min_and_Max();
		int []ar;
		int size=sc.nextInt();
		ar=new int[size];
		for(int i=0;i<size;i++){
			ar[i]=sc.nextInt();
		}		
		System.out.println("");
		System.out.println("Max :"+p.func_Max(ar,0,ar.length-1));
		System.out.println("Min :"+p.func_Min(ar,0,ar.length-1));
	}
	public int func_Max(int [] ar,int start,int end){
		if(end-start<2){
			if(ar[start]>ar[end]){
				return ar[start];
			}
			return ar[end];
		}
		int mid=(start+end)/2;
		return Math.max(func_Max(ar,start,mid),func_Max(ar,mid+1,end));
	}
	public int func_Min(int [] ar,int start,int end){
		if(end-start<2){
			if(ar[start]<ar[end]){
				return ar[start];
			}
			return ar[end];
		}
		int mid=(start+end)/2;
		return Math.min(func_Min(ar,start,mid),func_Min(ar,mid+1,end));
	}
}
