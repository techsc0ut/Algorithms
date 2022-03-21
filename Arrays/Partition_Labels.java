class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> Output_arr=new ArrayList<>();
        int lastIndices[]=new int[26];
        int len=s.length();
        for(int i=0;i<len;i++){
            lastIndices[s.charAt(i)-'a']=i;
        }
        int start=0, end=0 ;
        for(int i=0;i<len;i++){
            end=Math.max(end,lastIndices[s.charAt(i)-'a']);
            if(end==i){
                Output_arr.add(end-start+1);
                start=end+1;
            }
        }return Output_arr;
    }
}
