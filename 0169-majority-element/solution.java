class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int n = len/2;
        int k=0;
        for(int i=1;i<len;i++){
            if(nums[i] == nums[i-1]){
                k++;
            }
            else{
                if(k>=n){
                    return nums[k];
                }
                k=0;
            }
        }
        return nums[k];
    }
}
