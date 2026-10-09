class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=200;
                k--;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
