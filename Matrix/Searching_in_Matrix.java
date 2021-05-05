
//Solution-1
// O(logC+logR)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1 && matrix[0].length==1){
            return matrix[0][0]==target?true:false;
        }   
        if(matrix[0].length==1){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][0]==target){
                    return true;
                }
            }
            return false;
        }
        int r=func(matrix,target);
        if(r==-1){
            return false;
        }
        return func2(matrix,target,r);
    }
    public int func(int[][] matrix,int target){
        int start=0;
        int row=matrix.length;
        int end=row;
        while(start<end){
            int mid=(start+end)/2;
            if(matrix[mid][0]<target){
                if(mid+1<row && matrix[mid+1][0]>target){
                    return mid;
                }
                else if(mid+1<row && matrix[mid+1][0]==target){
                    return mid+1;
                }
                else if(mid==row-1){
                    return mid;
                }
                else if(mid+1==row-1 && matrix[mid+1][0]<target){
                    return mid+1;
                }else if(matrix[mid+1][0]<target){
                    start=mid+1;
                }
            }else if(matrix[mid][0]==target){
                return mid;
            }else{
                end=mid;
            }
        }
        return -1;
    }
    public boolean func2(int[][] matrix,int t,int row){
        int start=0;
        int end=matrix[row].length;
        while(start<end){
            int mid=(start+end)/2;
            if(matrix[row][mid]==t){
                return true;
            }else if(matrix[row][mid]>t){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}


// Solution-2
// One more solution :
// O(n+m)
class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row=0;
        int col=m[0].length-1;
        while(row<m.length && col>=0){
            if(m[row][col]==target){
                return true;
            }else if(m[row][col]>target){
                col--;
            }else{
                row++;
            }   
        }  
        return false;
    }
}




