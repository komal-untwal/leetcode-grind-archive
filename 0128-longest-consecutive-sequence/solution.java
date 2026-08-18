class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
          return 0;

        Set<Integer> nums_set = new HashSet<>();
        for(int n: nums){
            nums_set.add(n);
        }

        int counter=0;
        for(int n: nums_set){
            if(!nums_set.contains(n-1)){
                int start = 1;
                int current = n;
                while(nums_set.contains(current+1)){
                    start++;
                    current++;
                }
                counter = Math.max(counter,start);
            }
        }
        return counter;  
    }
}
