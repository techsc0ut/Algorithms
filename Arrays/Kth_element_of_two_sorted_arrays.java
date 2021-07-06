class Solution {
    public long kthElement(int arr1[],int arr2[],int n,int m,int k){
        int c=0;
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                c++;
                if(c==k){
                    return arr1[i];
                }
                i++;
            }else{
                c++;
                if(c==k){
                    return arr2[j];
                }
                j++;
            }
        }
        while(i<n){
            c++;
            if(c==k){
                return arr1[i];
            }
            i++;
        }
        while(j<m){
            c++;
            if(c==k){
                return arr2[j];
            }
            j++;
        }return -1;
    }
}
