class Solution{
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        int a,x,y,k;
        for(int i=0;i<n;i++){
            a=A[i];
            x=i+1;
            y=n-1;
            while(x<y){
                k=a+A[x]+A[y];
                if(k<X){
                    x++;
                }
                else if(k>X){
                    y--;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
