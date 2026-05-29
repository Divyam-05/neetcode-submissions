class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> CharSet = new HashSet<>();
        int l = 0;
        int res = 0;
        for(int r = 0 ; r<s.length() ; r++){
                while(CharSet.contains(s.charAt(r))){
                    CharSet.remove(s.charAt(l));
                    l++;

                }


                CharSet.add(s.charAt(r));

            res = Math.max(res, r-l+1);




        }
        return res;
    }
}
