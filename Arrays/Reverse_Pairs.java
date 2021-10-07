class Solution {
    public int reversePairs(int[] nums) {
        return findRev(nums,0,nums.length-1);
    }
    static int findRev(int nums[],int start,int end){
        int count=0;
        if(start<end){
            int mid=(start+end)/2;
            count+=findRev(nums,start,mid);
            count+=findRev(nums,mid+1,end);
            count+=merge(nums,start,mid,end);
        }
        return count;
    }
    static int merge(int ar[],int start,int mid,int end){
        int i = start; 
        int j = mid + 1;
        int count = 0;
        while (i <= mid && j <= end) {
            if ((long) ar[i] > 2 * (long) ar[j]) {
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }            
        }
        i=0;j=0;
		int index=start;
		int [] left=Arrays.copyOfRange(ar,start,mid+1);
		int [] right=Arrays.copyOfRange(ar,mid+1,end+1);
		while(i<left.length && j<right.length){
			if(left[i]>right[j]){
				ar[index++]=right[j++];
			}else{
				ar[index++]=left[i++];
			}
		}
		while(i<left.length){
			ar[index++]=left[i++];
		}
		while(j<right.length){
			ar[index++]=right[j++];
		}
        return count;
    }
}
