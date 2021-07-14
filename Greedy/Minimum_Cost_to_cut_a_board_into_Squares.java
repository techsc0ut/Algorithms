import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int ii=0;ii<t;ii++){
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        m--;n--;
	        int vertical[]=new int[m];
	        int horizontal[]=new int[n];
	        for(int i=0;i<m;i++){
	            vertical[i]=sc.nextInt();
	        }
	        for(int j=0;j<n;j++){
	            horizontal[j]=sc.nextInt();
	        }
	        Arrays.sort(vertical);
	        Arrays.sort(horizontal);
	        int i=m-1,j=n-1;
	        int hpcs=1,vpcs=1,cost=0;
	        while(i>=0 && j>=0){
	            if(vertical[i]>horizontal[j]){
	                cost+=vertical[i]*vpcs;
	                hpcs+=1;
	                i--;
	            }else{
	                cost+=horizontal[j]*hpcs;
	                vpcs+=1;
	                j--;
	            }
	        }
	        while(i>=0){
	            cost+=vertical[i]*vpcs;
	            hpcs+=1;
	            i--;
	        }
	        while(j>=0){
	            cost+=horizontal[j]*hpcs;
	            vpcs+=1;
	            j--;
	        }System.out.println(cost);
	    }
	}
}
