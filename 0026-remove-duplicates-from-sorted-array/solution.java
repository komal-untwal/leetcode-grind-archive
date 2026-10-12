class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                int j=i;
                while(j<nums.length && nums[j]==nums[i-1]){
                k--;
                nums[j]=200;
                j++;
                } 
                i=j;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
