class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int preProd = 1;
        int sufProd = 1;
        for(int i = 0; i < n; i++) {
            ans[i] = preProd;
            preProd *= nums[i];
        }
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= sufProd;
            sufProd *= nums[i];
        }
        return ans;
    }
}
