// The Idea is , to first transpose , and then simply for each row just swap the elements from start and end , using two pointers approach . 
class Solution {
    public void rotate(int[][] m) {
        int r=m.length;
        int c=r;
        for(int i=0;i<r;i++){
            for(int j=i;j<r;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            int a=0;
            int b=r-1;
            while(a<=b){
                int temp=m[i][a];
                m[i][a]=m[i][b];
                m[i][b]=temp;
                a++;
                b--;
            }
        }
    }
    
}
