class Solution {
    public int trap(int[] height) {
        int res = 0;
        int len=height.length;
        int i = 0 , j = len - 1;
        int lmax = 0 , rmax = 0 ;
        while(i <= j){
            if(height[i] <= height[j]){ 
                if(height[i] > lmax){
                    lmax = height[i];
                }else{
                    res += lmax - height[i];   
                }                             
                i++;
            }else{
                if(height[j] > rmax){
                    rmax = height[j];
                }else{
                    res += rmax - height[j];
                }
                j--;
            }
        }return res;
    }
}
