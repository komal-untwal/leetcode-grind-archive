class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefix_count = new HashMap<>();
        prefix_count.put(0,1);
        int currentSum=0;
        int diff =0;
        int res =0;
        
        int[] prfix_arr = new int[nums.length];
        prfix_arr[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prfix_arr[i] = prfix_arr[i-1] + nums[i]; 
        }

        for(int i=0; i<nums.length; i++){
            diff = prfix_arr[i]-k;
            res = res + prefix_count.getOrDefault(diff,0);
            prefix_count.put(prfix_arr[i], prefix_count.getOrDefault(prfix_arr[i],0)+1);
        }

        return res;

    }
}
