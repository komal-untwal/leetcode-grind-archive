class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==val){
                nums[i]=55;
                k++;
            }
        }
        Arrays.sort(nums);
        return (len-k);
    }
}
