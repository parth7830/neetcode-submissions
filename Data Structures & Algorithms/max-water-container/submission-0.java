class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n-1;
        int maxi = 0;
        while(l < r){
            int h = Math.min(heights[l] , heights[r]);
            int width = r-l;
            maxi = Math.max(maxi,h*width);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxi;
    }
}
