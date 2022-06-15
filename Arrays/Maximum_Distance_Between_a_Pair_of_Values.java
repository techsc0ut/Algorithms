/* Binary Search Approach O(nlogm) Time */
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            if(i<nums1.length && i<nums2.length && nums1[i]>nums2[i]){
                continue;
            }
            int ind=binSearch(nums1[i],nums2,i,nums2.length-1);
            ans=Math.max(ans,ind-i);
        }return ans;
    }
    public int binSearch(int val, int ar[], int start, int end){
        int ind=start;
        while(start<=end){
            int mid=(start+end)/2;
            if(ar[mid]>=val){
                ind=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ind;
    }
}

/* 2 Pointers Approach O(n+m) */
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                i++;
            }else{
                ans=Math.max(j++ - i,ans);
            }
        }return ans;
    }
}
