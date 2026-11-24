class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length], pro = new int[nums.length];
        int prePro = 1, sufPro = 1;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            pre[i] = prePro;
            prePro *= nums[i];

            pro[n-i-1] = sufPro;
            sufPro *= nums[n-i-1];
        }

        int[] output = new int[n];

        for(int i=0;i<n;i++){
            output[i] = pre[i] * pro[i];
        }

        return output;
    }
}  
