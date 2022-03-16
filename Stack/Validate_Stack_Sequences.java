// O(n) / O(n) Space
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





// O(n) / O(1) Space
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0; // Intialise one pointer pointing on pushed array
        int j = 0; // Intialise one pointer pointing on popped array
        
        for(int val : pushed){
            pushed[i++] = val; // using pushed as the stack.
            while(i > 0 && pushed[i - 1] == popped[j]){ // pushed[i - 1] values equal to popped[j];
                i--; // decrement i
                j++; // increment j
            }
        }
        return i == 0; // Since pushed is a permutation of popped so at the end we are supposed to be left with an empty stack
    }
}
