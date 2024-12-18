class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] res = new int[nums.length];
        while(i<=j){
            int sqr1 = nums[i]*nums[i];
            int sqr2 = nums[j]*nums[j];
            
            if(sqr1 > sqr2){
                res[k]=sqr1;
                i++;
            }
            else{
                res[k] = sqr2;
                j--;
            }
            k--;
           
        }
        //res[j]=nums[j]*nums[j];
        return res;
    }
}
