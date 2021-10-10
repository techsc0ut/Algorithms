class Solution{
    static int findPlatform(int arr[], int dep[], int n){   
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1, j=0 , plat=1 , max=1 ;
        while(i<n && j<n){
            if(arr[i]>dep[j]){
                j++;
                plat--;
            }else{
                i++;
                plat++;
            }
            max=Math.max(plat,max);
        }return max;
    }
}
