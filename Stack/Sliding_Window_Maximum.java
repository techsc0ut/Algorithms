class Solution {

    public int[] nextGreater(int[] nums, int len){

        int res[] = new int[nums.length];
        Stack<Integer> St = new Stack<>();

        St.push(len - 1);
        res[len - 1] = len;

        for(int i = len - 2; i >= 0; i--){

            while(!St.isEmpty() && nums[i] >= nums[St.peek()]){
                St.pop();
            }

            res[i] = !St.isEmpty() ? St.peek() : len;
            St.push(i);

        }

        return res;

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int len = nums.length;
        int nextG[] = nextGreater(nums, len);
        int max = Integer.MIN_VALUE;
        int res[] = new int[nums.length + 1 - k];

        for(int i = 0; i <= len - k; i++){

            int j = i;

            while(nextG[j] < i + k){
                j = nextG[j];
            }

            res[i] = nums[j];

        }

        return res;

    }
}
