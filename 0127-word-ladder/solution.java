class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> words = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        int count = 1;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            for(int i =0; i< size; i++)
            {
                char[] curr = queue.poll().toCharArray();
                
                for(int j=0; j<curr.length; j++)
                {
                    char temp = curr[j];
                    
                    for(char c ='a'; c <= 'z'; c++)
                    {
                        curr[j]=c;
                        String next = new String(curr);
                        if(words.contains(next))
                        {
                            if(next.equals(endWord)) return ++count;
                            queue.add(next);
                            words.remove(next);
                        }
                        
                    }
                    
                    curr[j] = temp;
                }
            }
            count++;
        }
        return 0;
    }
}
