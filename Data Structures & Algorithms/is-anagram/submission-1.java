class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sC = new int[26];
        int[] tC = new int[26];

        for(Character c : s.toCharArray())
            sC[c-'a']++;

        for(Character c : t.toCharArray())
            tC[c-'a']++;

        for(int i=0; i<26;i++)
            if(sC[i]!=tC[i])
                return false;

        return true;
    }
}
