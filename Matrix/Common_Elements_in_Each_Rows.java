import java.io.*;
import java.util.*;

class practice{
		public static void main (String[] args) {
		int mat[][] =
        {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };
        ArrayList<Integer> A=func(mat,mat.length,mat[0].length);
        print(A);
	}
	public static void print(ArrayList<Integer> A){
	    for(int i=0;i<A.size();i++){
	        System.out.print(A.get(i)+" ");
	    }
	}
	public static ArrayList<Integer> func(int mat[][],int n ,int m){
	    ArrayList<Integer> A=new ArrayList();
	    HashMap<Integer,Integer> H=new HashMap();
	    for(int i=0;i<n;i++){
	        Set<Integer> S=new HashSet();
	        for(int j=0;j<m;j++){
	            if(!S.contains(mat[i][j])){
	                //System.out.print(mat[i][j]+" ");
	                S.add(mat[i][j]);
	                Integer x=H.get(mat[i][j]);
	                if(x!=null){
	                    if(x==n-1){
	                        A.add(mat[i][j]);
	                    }else{
	                        H.put(mat[i][j],x+1);
	                    }
	                }else{
	                    H.put(mat[i][j],1);
	                }
	            }
	        }
	    }
	    return A;
	}	
}
