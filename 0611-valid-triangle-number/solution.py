class Solution(object):
    def triangleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        nums.sort()
        count = 0
        
        for i in range(n-1,0,-1):
            l=0
            r=i-1
            while(l<r):
                if(nums[l] + nums[r] > nums[i]):
                    count += r - l
                    r -= 1
                    
                else:
                    l += 1
        
        return(count)            
        
        
