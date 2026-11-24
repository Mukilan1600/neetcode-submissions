class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        int l=0,r=nums.length;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            l=i+1;
            r=nums.length-1;
            while(l<r){
                if(nums[i] < -(nums[l]+nums[r]))
                    l++;
                else if(nums[i] > -(nums[l]+nums[r]))        
                    r--;
                else{
                    ans.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])
                        l++;
                    while(l<r && nums[r]==nums[r+1])
                        r--;
                }
            }   
        }

        return ans;
    }
}
