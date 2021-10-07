class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        if(n<3){
            return res; 
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
            int a=i+1;
            int b=n-1;
            while(a<b){
                int z=nums[i]+nums[a]+nums[b];
                if(z>0){
                    b--;
                }else if(z<0){
                    a++;
                }else if(z==0){
                    List<Integer> li=new ArrayList<>();
                    li.add(nums[i]);li.add(nums[a]);li.add(nums[b]);
                    res.add(li);
                    while(a+1<n && nums[a]==nums[a+1]){
                        a++;
                    }
                    while(b-1>0 && nums[b]==nums[b-1]){
                        b--;
                    }
                    a++;
                    b--;
                }
            }
        }return res;
    }
}
