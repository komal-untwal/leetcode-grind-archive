class Solution {
    public boolean isPalindrome(String s) {
        String e = s.replaceAll("[^a-zA-Z0-9]","");
        String n = e.toLowerCase();
        char[] c = n.toCharArray();
        int len = n.length();
        if(len==0){
            return true;
        }
        for(int i=0, j=len-1; i<len/2;  i++, j--){
            if(c[i] != c[j] && j>len/2-1){
                return false;
            }
        }
        return true;
    }
}
