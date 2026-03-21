class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> resMap = new HashMap<>();
        Stack<Integer> numStack = new Stack<>();

        for(int i=0; i<nums2.length; i++){
            while(!numStack.isEmpty() && nums2[i] > numStack.peek()){
                resMap.put(numStack.pop(),nums2[i]);
            }
            numStack.push(nums2[i]);
        }
        for(int j=0; j<nums1.length; j++){
            if(null != resMap.get(nums1[j])){
                ans[j]=resMap.get(nums1[j]);
            }else{
                ans[j]=-1;
            }  
        }
        return ans;
    }
}
