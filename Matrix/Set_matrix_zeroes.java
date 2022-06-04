/* Here we are starting our loop from row 1 and col 1 so to avoid corner cases, and hence handling 1st row and 1st column at last */
class Solution {
    public void setZeroes(int[][] mat) {
        boolean isFirstRow=false;
        boolean isFirstCol=false;
        for(int i=0;i<mat[0].length;i++){
            if(mat[0][i]==0){
                isFirstRow=true;
                break;
            }
        }
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0){
                isFirstCol=true;
                break;
            }
        }
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }
        if(isFirstRow){
            for(int i=0;i<mat[0].length;i++){
                mat[0][i]=0;
            }
        }
        if(isFirstCol){
            for(int i=0;i<mat.length;i++){
                mat[i][0]=0;
            }
        }
    }
}
