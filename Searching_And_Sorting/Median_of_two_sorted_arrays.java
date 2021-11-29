class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            int[] arr= nums1.length != 0 ? nums1 : nums2;
            if(arr.length % 2 != 0) return arr[arr.length/2];
            return ((double)arr[arr.length/2] + (double)arr[arr.length/2-1])/2;
        }
        
        //We want to perform our binary search on the array with less elements to improve time complexity        
        if(nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length;
        int n = nums2.length;
 
        int low = 0;
        int high = m;
        
        while(low <= high) {
            int partition1 = low + (high - low)/2;
            int partition2 = (m+n)/2 - partition1;
            
            int left1 = (partition1 == 0)? Integer.MIN_VALUE : nums1[partition1-1];
            int left2 = (partition2 == 0)? Integer.MIN_VALUE : nums2[partition2-1];
            int right1 = (partition1 == m)? Integer.MAX_VALUE : nums1[partition1];
            int right2 = (partition2 == n)? Integer.MAX_VALUE : nums2[partition2];
            
            //Good Partition (l1 < r2 && l2 < r1)
            
            if(left1 > right2) {
                high = partition1-1;
            } else if (left2 > right1) {
                low = partition1+1;
            } else {
                if((m+n)%2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.min(right1, right2);
                }
            }
        }
        return -1;
    }
}
