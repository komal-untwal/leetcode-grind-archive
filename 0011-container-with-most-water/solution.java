class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int i=0, j=height.length-1;
        while(i<j){
            int temp = (j-i) * Math.min(height[i],height[j]);
            res= Math.max(res, temp);
            if(height[i]>height[j]){ j--; }
            else{ i++; }
        }
        return res;
    }
}
