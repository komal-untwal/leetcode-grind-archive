class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int counter = 0;
        for (int num : set){
            if (!set.contains(num-1)){
                int start = 1;
                int current = num;
                while(set.contains(current+1)){
                    start++;
                    current++;
                }
                counter = Math.max(counter,start);
            }
        }
        return counter;
    }
}
