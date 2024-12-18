class Solution {
    public boolean isPalindrome(String s) {
        //convert to alphanumeric char in all lowercase letter
        //String s_alpha = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray(); 
        char[] s_Arr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();

        //handle edgecases
        //if(s_alpha.isEmpty()) return true;

        //char[] s_Arr = s_alpha.toLowerCase().toCharArray();
       
        int i=0; 
        int j=s_Arr.length-1;
        while(i<=j){
            if(s_Arr[i] != s_Arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
