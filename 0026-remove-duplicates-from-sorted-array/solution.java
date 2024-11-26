class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int k=0;
        int dup=0;
        while(k<len-1){
            while(k<len-1 && nums[k]==nums[k+1]){
                nums[k]=200;
                dup++;
                k++;
            }
            k++;
        }
        Arrays.sort(nums);
        return len-dup;
    }
}
