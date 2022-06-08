class Solution {
    public int removePalindromeSub(String s) {
        int len=s.length();
        if(len==0){
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        if(sb.reverse().toString().equals(s)){
            return 1;
        }return 2;
    }
}
