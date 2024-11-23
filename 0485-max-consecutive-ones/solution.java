class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cnt=0;
        int len= nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                cnt++;
            }else{
                if(cnt>max){
                    max=cnt;
                }
                cnt=0;
            }
        }
        if(cnt>max){max=cnt;}
        return max;
    }
}
