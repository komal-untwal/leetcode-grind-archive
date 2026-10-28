class Solution {
    public int characterReplacement(String s, int k) {
        //window_length(r-l+1) - Max_count of any one char <= k -this is a valid window

        int res =0;
        Map<Character,Integer> count = new HashMap<>();
        int max_freq = 0;
        int i=0;
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            count.put(c, count.getOrDefault(c,0)+1);
            max_freq = Math.max(max_freq, count.get(c));

            if((r-i+1 - max_freq) > k){
                count.put(s.charAt(i), count.get(s.charAt(i))-1);
                i++;
            }
            res = Math.max(res, r-i+1);
        }

        return res;
    }
}
