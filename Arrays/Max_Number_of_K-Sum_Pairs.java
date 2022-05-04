/* O(nlogn) and O(1) */
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1, count=0;
        while(i<j){
            int z=nums[i]+nums[j];
            if(z==k){
                System.out.println(z+" "+i+"->"+j);
                count++;
                i++;
                j--;
            }else if(z>k){
                j--;
            }else{
                i++;
            }
        }return count;
    }
}

/* O(n) and O(n) */
class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> H=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int z=k-nums[i];
            if(H.get(z)!=null){
                count++;
                if(H.get(z)==1){
                    H.remove(z);
                }else{
                    H.put(z,H.get(z)-1);
                }
            }else{
                H.put(nums[i],H.getOrDefault(nums[i],0)+1);
            }
        }return count;
    }
}
