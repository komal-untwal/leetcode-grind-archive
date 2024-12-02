class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            s.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            if(s.containsKey(target-nums[j]) && j!=s.get(target-nums[j])){
                ans[0]=j;
                ans[1]= s.get(target-nums[j]);
                return ans;
            }
        }
        return null;
    }
}
