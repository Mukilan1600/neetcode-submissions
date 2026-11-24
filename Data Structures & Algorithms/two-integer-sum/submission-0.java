class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> idx = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int idxE = idx.getOrDefault(target-nums[i], -1);
            if(idxE != -1)
                return new int[]{idxE, i};
            
            idx.put(nums[i], i);
        }

        return new int[]{};
    }
}
