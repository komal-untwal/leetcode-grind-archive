class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_size= Integer.MAX_VALUE;
        int temp_sum=0;
        for(int i=0, j=0; j<nums.length; j++){
            temp_sum = temp_sum + nums[j]; 
            while(temp_sum>=target){
                min_size = Math.min(min_size, j-i+1);
                temp_sum = temp_sum - nums[i];
                i++;
            }
        }
        if(min_size == Integer.MAX_VALUE) return 0;
        return min_size;
    }
}
