class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> res = new HashMap<> ();

        for(String s: strs){
            int[] arr = new int[26];
            for(char ch : s.toCharArray()){
                arr[ch - 'a']++;
            }
            String k = Arrays.toString(arr);

            res.putIfAbsent(k, new ArrayList<>());
            res.get(k).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
