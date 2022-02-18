class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> St=new Stack<>();
        int size=num.length();
        int i=0;
        if(size==k) return "0";
        while(i<size){
            char c=num.charAt(i);
            while(!St.isEmpty() && k>0 && St.peek()>c){
                St.pop();
                k--;
            }
            St.push(c);
            i++;
        }
        while(k>0){
            St.pop();
            k--;
        }
        java.lang.StringBuffer Sb = new java.lang.StringBuffer();
        while(!St.isEmpty()){
            char c=St.pop();
            Sb.append(c);
        }
        Sb.reverse();
        while(Sb.length()>1 && Sb.charAt(0)=='0'){
            Sb.deleteCharAt(0);
        }
        return Sb.toString();
    }
}
