class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        new = ""
        temp = ""
        
        for i in range(len(s)):
            if s[i] not in temp:
                temp = temp + s[i]
                if len(temp)> len(new):
                    new = temp
            else:
                temp = temp[temp.index(s[i])+1:] + s[i]
        return len(new)        
            
 
            
         
                
                
