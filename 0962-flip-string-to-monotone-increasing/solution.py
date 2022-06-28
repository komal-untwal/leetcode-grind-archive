class Solution:
    def minFlipsMonoIncr(self, s: str) -> int:
        minFlips = flips = s.count('0')

        for i in s:
            if i == '0':
                flips -= 1
            else:
                flips += 1
            minFlips = min(minFlips, flips)
        
        return minFlips
        
        
