class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c: s.toCharArray())
        {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(char r: t.toCharArray())
        {
            map2.put(r, map2.getOrDefault(r,0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
