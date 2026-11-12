class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        int curr = 0;
    
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n: nums){
            curr = (curr + n) % k;
            //(prev_sum + curr) % k = 0
            if(curr <0) curr += k;
            res += map.getOrDefault(curr,0);
            map.put(curr, map.getOrDefault(curr,0) + 1);
        }
        return res;
    }
}
