class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n : nums){
            count.putIfAbsent(n, 0);
            count.put(n, count.get(n) + 1);
        }
        
        //buccket sort
        List<Integer>[] freq = new ArrayList[nums.length+1];
        for(int i=0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            int c = entry.getValue();
            int num = entry.getKey();
            freq[c].add(num);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=freq.length - 1; i>=0; i--){
            for(int n : freq[i]){
                res.add(n);
                if(res.size() == k){
                    int[] result = new int[k];
                    for (int j = 0; j < k; j++) {
                        result[j] = res.get(j);
                    }
                    return result;
                }
            }
        }    

        return new int[0];
    }
}
