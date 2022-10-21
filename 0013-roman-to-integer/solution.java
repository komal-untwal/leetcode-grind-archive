class Solution {
    public int romanToInt(String s) {
        // iterate num in reverse order, compare the num with prev no if num<prev, answer -= num else answer += num
        // for this we need 3 variables to store answer, num,& previous num.
        //use switch case to define & identify each symbol with associated num:
        
        int ans=0, prev=0, num=0;
        for(int i= s.length()-1; i>=0; i--)
        {
            switch(s.charAt(i))
            {
                case 'I'-> num = 1;
                case 'V'-> num = 5;
                case 'X'-> num = 10;
                case 'L'-> num = 50;
                case 'C'-> num = 100;
                case 'D'-> num = 500;
                case 'M'-> num = 1000;
            }
            
            if (num < prev)
                ans -= num;
            else
                ans += num;
            
            prev = num;
        }
        return ans;
    }
}
