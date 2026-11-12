class Solution {
    public int findMaxLength(int[] nums) {
        int max_len = 0;
        int curr_sum = 0;

        HashMap<Integer,Integer> prefix_sum = new HashMap<>();
        prefix_sum.put(0,-1);

        for(int i=0; i<nums.length; i++){
            curr_sum += (nums[i] == 0)? -1: 1;

            if(prefix_sum.containsKey(curr_sum)){
                max_len = Math.max(max_len, i-prefix_sum.get(curr_sum));
            }else{
                prefix_sum.put(curr_sum, i);
            }
        }
        return max_len;   
    }
}
