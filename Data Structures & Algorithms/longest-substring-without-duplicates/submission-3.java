class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cha = new HashSet<>();

        int i=0, mxL=0, l=0,r=0;
        while(r<s.length()){
            char c = s.charAt(r);
            if(cha.contains(c)){
                while(l<r && cha.contains(c)){
                    cha.remove(s.charAt(l));
                    l++;
                }
            }

            cha.add(c);

            mxL = Math.max(mxL, r-l+1);
            r++;
        }

        return mxL;
    }
}
