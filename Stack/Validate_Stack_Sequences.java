class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> St=new Stack();
        for(int val:pushed){
            St.push(val);
            while(!St.isEmpty() && St.peek()==popped[j]){
                j++;
                St.pop();
            }
        }
        return St.isEmpty();
    }
}
