class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chr = new HashSet<>();
        int l=0, count=0; 
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            while(chr.contains(c)){
                chr.remove(s.charAt(l));
                l++;
            }
            chr.add(c);
            count = Math.max(count, r-l+1);
        }

        return count;
    }
}
