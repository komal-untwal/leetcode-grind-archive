class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map <String,List<String>> seen = new HashMap<>(); 
     for(String str : strs){
        int[] tempArr = new int[26];
        for(char c : str.toCharArray()){
            tempArr[c - 'a']++;
        }
        String tempkey = Arrays.toString(tempArr);
        seen.computeIfAbsent(tempkey , k -> new ArrayList<>()).add(str);
     }
     return new ArrayList<> (seen.values());   
    }
}
