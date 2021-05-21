class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        int j=0;
        int s=0;
        //squares of each element
        for (int k=0;k<nums.length;k++)
        {
            if(nums[k]<0)
                j++;
            nums[k]=nums[k]*nums[k];
        }
        i=j-1;
        //if array contains both +ve & -ve elements
        while(i>=0 && j<=nums.length-1)
        {
            if(nums[i]<nums[j])
            {
            result[s]=nums[i];
            i--;
            }
            else
            {
                result[s]=nums[j];
                j++;
            }
            s++;
        }
        //if array contains all -ve elements
        while(i>=0)
        {
            result[s]=nums[i];
            i--;
            s++;
        }
        //if array contains all +ve elements
        while(j<=nums.length-1)
        {
            result[s]=nums[j];
            j++;
            s++;
        }
        return result;
}
}
