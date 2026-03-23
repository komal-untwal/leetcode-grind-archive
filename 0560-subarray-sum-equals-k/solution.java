class Solution {
    public int subarraySum(int[] nums, int k) {
        //currentSum - prevoiusSum = k
        //previousSum = k - currentSum

        HashMap<Integer,Integer> map = new HashMap<>();

        int noOfSubArray = 0;
        int prefixSum = 0;
        //int remove = 0;

        map.put(0,1);
        for(int i=0;i<nums.length; i++){
            prefixSum += nums[i];
            int remove = prefixSum  - k;

            if(map.containsKey(remove)){
                noOfSubArray += map.get(remove);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return noOfSubArray;
    }
}
