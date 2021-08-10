class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
        int[] temp = Arrays.copyOf(heights,heights.length);
        //for(int i=0;i<heights.length;i++)
        //    temp[i]=heights[i];
        
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i] != temp[i])
                count++;
        }
        return count;
    }
}
