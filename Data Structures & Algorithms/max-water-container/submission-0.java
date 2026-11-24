class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int mxVol = 0;
        while(l<r){
            mxVol = Math.max(mxVol, Math.min(heights[l], heights[r]) * (r-l));

            if(heights[l] < heights[r])
                l++;
            else
                r--;
        }


        return mxVol;
    }
}
