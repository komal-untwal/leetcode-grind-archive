class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Set<Integer> sum_set = new HashSet<>();
        int sum =0;
        int count=0;
        for(int r=0,l=0; r<nums.length; r++){
            while(count<k){
                sum = sum + nums[r];
                count++;
                r++;
            }
            sum_set.add(sum);
            sum= sum - nums[l];
            if(l<nums.length-k){
            l++;
            count--;
            r--;
            }
        }
        return (double) Collections.max(sum_set)/k;
    }
}
