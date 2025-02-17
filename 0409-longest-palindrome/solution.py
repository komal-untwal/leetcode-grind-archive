class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_set=set()
        pair_len= 0
        
        for c in s:
            if c not in hash_set:
                hash_set.add(c)
            else:
                pair_len += 2
                hash_set.remove(c)
        if hash_set:
            pair_len += 1
        return pair_len             

