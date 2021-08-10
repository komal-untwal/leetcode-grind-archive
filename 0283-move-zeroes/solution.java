class Solution {
    public void moveZeroes(int[] nums) {
       
        int numNonZero = 0;
        //first search and add all non-zero elements in given sequence
            for(int i =0;i<nums.length;i++)
            {
                if(nums[i] !=0)
                    nums[numNonZero++] = nums[i];
            }
        
        //now add all zero to end
        
        for(int i=numNonZero;i<nums.length;i++)
            nums[i] = 0;
    }
}
