class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(freq.getOrDefault(nums[i], 0) == 1)
                return true;
            freq.put(nums[i], 1);
        }

        return false;
    }
}