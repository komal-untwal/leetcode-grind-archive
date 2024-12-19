class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        Set<Character> vow = new HashSet<>();
        vow.addAll(Arrays.asList(new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
        //Set vow = new HashSet<> ('a','e','i','o','u','A','E','I','O','U');
        char[] s_Arr = s.toCharArray();
        while(i<j){
            if(vow.contains(s_Arr[i])){
                if (vow.contains(s_Arr[j])){
                    char temp = s_Arr[j];
                    s_Arr[j] = s_Arr[i];
                    s_Arr[i] = temp;
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else{
                i++;
            }
        }
        return String.valueOf(s_Arr);
    }
}
