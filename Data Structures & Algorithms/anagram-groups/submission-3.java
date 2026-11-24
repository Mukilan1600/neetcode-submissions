class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[][] freq = new int[strs.length][26];

        Map<String, List<String>> groups = new HashMap<>(); 

        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            for(Character c: s.toCharArray()){
                freq[i][c-'a']++;
            }
        }

        for(int g=0;g<freq.length;g++){
            int[] i = freq[g];
            String k = "";
            for(int h=0;h<i.length;h++){
                k += ('a' + h) + i[h];
            }

            List<String> l = groups.getOrDefault(k, new ArrayList<String>());
            l.add(strs[g]);
            groups.put(k, l);
        }

        return new ArrayList<>(groups.values());
    }
}
