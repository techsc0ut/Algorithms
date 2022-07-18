class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int ans=0;
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=1;j<col;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for(int start=0;start<col;start++){
            for(int end=start;end<col;end++){
                HashMap<Integer,Integer> H=new HashMap<>();
                H.put(0,1);
                int curSum=0;
                for(int r=0;r<row;r++){
                    int pref=start==0?0:matrix[r][start-1];
                    curSum+=matrix[r][end]-pref;
                    if(H.containsKey(curSum-target)){
                        ans+=H.get(curSum-target);
                    }
                    H.put(curSum,H.getOrDefault(curSum,0)+1);
                }
            }
        }
        return ans;
    }
}
