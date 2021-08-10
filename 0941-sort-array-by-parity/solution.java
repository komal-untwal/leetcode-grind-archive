class Solution {
    public int[] sortArrayByParity(int[] nums) {
       /* int[] res = new int[nums.length];
        int j = 0;
        int k=nums.length-1;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
                res[j++]=nums[i];
            else
                res[k--]=nums[i];
        }
        return res;
        */
        
        int i =0;
        int j = nums.length-1;
        
        while(i<j)
        {
            if(nums[i] % 2 > nums[j] % 2)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            
            if(nums[i] % 2 == 0) i++;
            if(nums[j] % 2 == 1) j--;
        }
        return nums;
    }
}
