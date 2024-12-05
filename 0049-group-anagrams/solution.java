class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*** Naive approach: sort every strings & store it in a hasMap with key as sorted string & add list of the input strings that matches with the key(anagrams) finally return the List of all values in the map.*/

        Map<String, ArrayList<String>> res = new HashMap<>();
        for(String s: strs){
            char[] charStr = s.toCharArray();
            Arrays.sort(charStr);
            String sortedS = String.valueOf(charStr);
            res.putIfAbsent(sortedS, new ArrayList<String>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
