class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> seen = new HashSet<>();
        for(int i: nums){
            seen.add(i);
        }

        int max_count = 0;
        for(int num: seen){
            if(!seen.contains(num-1)){
                int count = 1;
                int curr = num;
                while(seen.contains(curr+1)){
                    count++;
                    curr++;
                }
                max_count = Math.max(max_count,count);
            }
        }
        return max_count;
    }
}
