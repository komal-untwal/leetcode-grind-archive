class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n,0)+1);
        }

        ArrayList<Integer>[] freq = new ArrayList[nums.length+1];
        for(int i=0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=freq.length-1; i>0;i--){
            for(int x: freq[i]){
                ans.add(x);
                if(ans.size() == k){
                    int[] res = new int[k];
                    for(int j=0;j<k;j++){
                        res[j]=ans.get(j);
                    }
                    return res;
                }
            }
        }
        return null;
    }
}
