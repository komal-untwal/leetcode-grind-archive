class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10 ==0 && x != 0))
            return false;
        
        //reverse num
        int y = 0;
        int prex = x;
        
        while(x>y)
        {  
            y = y * 10 + (x % 10);
            prex = x;
            x = x/10;
        }
        
        if (x==y || prex == y)
            return true;
        else 
            return false;
    }
}
