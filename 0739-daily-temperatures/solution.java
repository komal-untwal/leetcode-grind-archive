class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> tempStack = new Stack<>();

        for(int i=0; i<n; i++){
            while(!tempStack.isEmpty() && temperatures[i] > tempStack.peek()[0]){
                int stackIndx = tempStack.pop()[1];
                res[stackIndx] = i - stackIndx;
            }
            tempStack.push(new int[] {temperatures[i],i});
        }
        return res;
    }
}
