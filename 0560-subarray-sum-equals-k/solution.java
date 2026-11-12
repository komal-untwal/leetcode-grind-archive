class Solution {
    public int subarraySum(int[] nums, int k) {
        //intution is there could be a prev_Sum such that curr_sum-prev_sum=k
        // so we need to find if there exist any such prev_sum, prev_Sum = curr_sum -k

        int res = 0;
        int prev_sum = 0;
        int curr_sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int n: nums){
            curr_sum += n;

            prev_sum = curr_sum - k;

            res += map.getOrDefault(prev_sum, 0);
            map.put(curr_sum, map.getOrDefault(curr_sum,0)+1);
        }

        return res;
        
    }
}
