class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int topA[]=new int[7], botB[]=new int[7], same[]=new int[7];
        for(int i=0;i<tops.length;i++){
            topA[tops[i]]++;
            botB[bottoms[i]]++;
            if(tops[i]==bottoms[i]){
                same[tops[i]]++;
            }
        }
        int minSwaps=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++){
            if(topA[i]+botB[i]-same[i]==tops.length){
                minSwaps=Math.min(minSwaps,Math.min(topA[i],botB[i])-same[i]);
            }
        }
        return minSwaps==Integer.MAX_VALUE?-1:minSwaps;
    }
}
