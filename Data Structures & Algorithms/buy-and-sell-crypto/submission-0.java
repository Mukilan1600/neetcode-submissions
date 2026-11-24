class Solution {
    public int maxProfit(int[] prices) {
        int mxP=0, n=prices.length;
        int l=0, r=0;
        while(r<n){
            mxP = Math.max(mxP, prices[r]-prices[l]);
            r++;
            if(r<n && prices[r]<prices[l])
                l=r;
        }

        return mxP;
    }
}
