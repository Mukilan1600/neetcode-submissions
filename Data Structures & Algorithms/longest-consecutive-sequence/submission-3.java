class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int i: nums){
            numSet.add(i);
        }

        int maxL = 0;
        for(int i: nums){
            if(numSet.contains(i-1))
                continue;
            int j=i+1, len=1;
            while(numSet.contains(j)){
                len++;
                j++;
            }

            maxL = Math.max(maxL, len);
        }

        return maxL;
    }
}
