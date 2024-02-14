class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int len = nums.length;
        int j = len-1;
        int i = 0;
        while(i<=j)
        {
            if(nums[i] == val){
                k++;
                while(j>0 && j!=i && nums[j] == val){
                    k++;
                    j--;
                }
                nums[i]=nums[j];
                j--;
            }
            i++;

        }
        return (len-k);

    }
}
