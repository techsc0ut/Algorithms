class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer> A=new ArrayList();
        int rowBegin=0;
        int rowEnd=r-1;
        int colBegin=0;
        int colEnd=c-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                A.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                A.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    A.add(matrix[rowEnd][i]);
                }    
            }
            rowEnd--;
            
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    A.add(matrix[i][colBegin]);
                }       
            }
            colBegin++;
        }
        return A;
    }
}
