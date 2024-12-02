import java.lang.Math;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                if(h.get(nums[i]) != i && (Math.abs(h.get(nums[i])-i) <=k)){
                    return true;
                }
            }
            h.put(nums[i],i);
        }
        return false;
    }
}
