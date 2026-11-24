class Solution {
    public int trap(int[] height) {
        int water = 0;
        int[] leftWalls = new int[height.length];
        int[] rightWalls = new int[height.length];

        int mxWall = 0;
        for(int i=0;i<height.length;i++){
            leftWalls[i] = mxWall;
            mxWall = Math.max(mxWall, height[i]);
        }

        mxWall = 0;
        for(int i=height.length-1;i>=0;i--){
            rightWalls[i] = mxWall;
            mxWall = Math.max(mxWall, height[i]);
        }

        for(int i=0;i<height.length;i++){
            int cr = Math.min(leftWalls[i], rightWalls[i]) - height[i];
            if(cr>0)
                water+=cr;
        }

        return water;
    }
}
