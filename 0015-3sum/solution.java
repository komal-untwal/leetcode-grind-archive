class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue; //avoids duplicate i

            int target = 0-nums[i];
            int k=i+1, l=nums.length-1;
            while(k<l){
                int sum = nums[k]+nums[l];
                if(sum == target){
                    res.add(Arrays.asList(nums[i],nums[k],nums[l]));
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1]) k++;
                    while(k<l && nums[l]==nums[l+1]) l--;
                }else if(sum > target){
                    l--;
                }else{
                    k++;
                }
            }
        }

        return res;
    }
}
