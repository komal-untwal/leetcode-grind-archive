class Solution {
    public boolean isPalindrome(String s) {
        String s_cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0, r=s_cleaned.length() - 1;
        while(l<=r){
            if(s_cleaned.charAt(l) != s_cleaned.charAt(r)){
                 return false;
                 }
            l++;
            r--;
        }    

        return true;
    }
}
