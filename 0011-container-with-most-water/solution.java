//import java.lang.Math;
class Solution {
    public int maxArea(int[] height) {
        //brute force approach would be
        /**nt area=0;
        int max_area = 0;
        for(int i=0;i<height.length;i++){
            for(int j=1; j<height.length; j++){
                area = Math.min(height[i],height[j]) * (j-i);
                max_area= Math.max(max_area, area);
            }
        }
        return max_area; **/

        int area=0;
        int max_area =0;
        int i=0, j=height.length - 1;
        
        while(i<j){
            area = Math.min(height[i],height[j]) * (j-i);
            max_area= Math.max(max_area, area);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max_area;

    }
}
