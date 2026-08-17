class Solution {
    public int maxArea(int[] heights) {
        int container = 0;
        int left = 0;
        int right = heights.length-1;
        while(left < right){
            int width = right - left;
            int height = Math.min(heights[right],heights[left]);
            container = Math.max((width * height),container);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right --;
            }
        }

        return container;
    }
}
