class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*** Naive approach: sort every strings & store it in a hasMap with key as sorted string & add list of the input strings that matches with the key(anagrams) finally return the List of all values in the map.*/

        Map<String, ArrayList<String>> res = new HashMap<>();
        /***for(String s: strs){
            char[] charStr = s.toCharArray();
            Arrays.sort(charStr);
            String sortedS = String.valueOf(charStr);
            res.putIfAbsent(sortedS, new ArrayList<String>());
            res.get(sortedS).add(s);
        } ***/

        /***Use a count array of size 26(total alphabets:26) & for each string maitain the count of which chars in this array & use this array(convert it to string first) as a key in a map & store all matching strings in a list as its values ***/

        for(String s: strs){
            char[] count = new char[26];
            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<String>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
