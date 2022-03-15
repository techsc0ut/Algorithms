class Solution {
    public String minRemoveToMakeValid(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){ /* This loop gets rids off ')' which are occuring initially for eg:-   ))() , then it will remove initial two ')' */
            if(c == '(')    count ++;
            else if(c == ')'){
                if(count == 0)  continue;
                count--;
            }
            sb.append(c);
        }
        for(int i=sb.length()-1; i>=0 && count>0; i--){/* From Backside of the string we remove the excess occuring open bracket '(' */
            if(sb.charAt(i) == '('){
                sb.deleteCharAt(i);
                count--;
            }
        }
        return sb.toString();
    }
}
