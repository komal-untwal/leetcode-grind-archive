class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resMap = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if (!resMap.containsKey(key)){
                resMap.put(key, new ArrayList<>());
            }
            resMap.get(key).add(str);
        }

        return new ArrayList<>(resMap.values());
    }
}
