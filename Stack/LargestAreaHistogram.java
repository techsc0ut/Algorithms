class Solution {

    public int[] helperRight(int[] heights, int len){
        
        int res[] = new int[len];
        Stack<Integer> St = new Stack<>();

        St.push(len - 1);
        res[len - 1] = len;

        for(int i = len - 1; i >= 0; i--){

            while(!St.isEmpty() && heights[i] <= heights[St.peek()]){
                St.pop();
            }

            res[i] = !St.isEmpty() ? St.peek() : len;

            St.push(i);
        }

        return res;
    }

    public int[] helperLeft(int[] heights, int len){

        int res[] = new int[len];
        Stack<Integer> St = new Stack<>();

        St.push(0);
        res[0] = -1;

        for(int i = 1; i < len; i++){

            while(!St.isEmpty() && heights[i] <= heights[St.peek()]){
                St.pop();
            }

            res[i] = !St.isEmpty() ? St.peek() : -1;

            St.push(i);
        }

        return res;
        
    }

    public int largestRectangleArea(int[] heights) {

        int len = heights.length;
        
        int nearestSmallLeft[] = helperLeft(heights, len);
        int nearestSmallRight[] = helperRight(heights, len);

        int maxArea = 0;

        for(int i = 0; i < len; i++){

            int width = nearestSmallRight[i] - nearestSmallLeft[i] - 1;
            int area = heights[i] * width;

            if(maxArea < area){
                maxArea = area;
            }

        } 

        return maxArea;
    }
}
