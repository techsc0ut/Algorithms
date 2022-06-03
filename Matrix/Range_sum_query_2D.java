/* Brute Force */
class NumMatrix {
    int m[][];
    public NumMatrix(int[][] matrix) {
        m=matrix;
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                sum+=m[i][j];
            }
        }return sum;
    }
}
/* Ends */

/* Efficient Approach */
class NumMatrix {
    int sumMat[][];
    public NumMatrix(int[][] matrix) {
        int r=matrix.length, c=matrix[0].length;
        sumMat=new int[r+1][c+1];// Taking matrix size 1 more than, to handle corner cases.
        for(int i=0;i<r;i++){
            int prefix=0;
            for(int j=0;j<c;j++){
                prefix+=matrix[i][j];
                int above=sumMat[i][j+1];
                sumMat[i+1][j+1]=prefix+above;
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++; // Since our matrix is one size greater
        int bottomRight=sumMat[row2][col2];
        int above=sumMat[row1-1][col2];
        int left=sumMat[row2][col1-1];
        int topLeft=sumMat[row1-1][col1-1];
        return bottomRight-above-left+topLeft;
    }
}
/* Ends */
