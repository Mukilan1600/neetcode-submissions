class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: nums)
            mp.put(i, mp.getOrDefault(i, 0)+1);

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> Integer.compare(mp.get(b), mp.get(a)));

        for(int i: mp.keySet())
            heap.add(i);

        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = heap.poll();

        return ans;
    }
}
