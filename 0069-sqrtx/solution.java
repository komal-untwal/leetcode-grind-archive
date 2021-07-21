class Solution {
    public int mySqrt(int x) {
        long start=0, end = x;
        long res=0;
        
        while(start<= end)
        {
           long mid = (start+end) /2;
            if(mid * mid == x)
                return (int)mid;
        
            if (mid * mid <= x)
            {
                start = mid +1;
                res = mid;
            }
            else
            {
                end = mid-1;
            }
        }
        return (int)res;
}
}
