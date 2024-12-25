class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        closest_sum=float('inf')
        n = len(nums)
        nums.sort()

        for i in range(n):
            if i>0 and nums[i] == nums[i-1]:
                continue;

            l,r = i+1, len(nums)-1
            while l<r:
                curr_sum = nums[i] + nums[l] + nums[r]

                if abs(closest_sum -target) > abs(curr_sum - target):
                    closest_sum = curr_sum
                if curr_sum > target:
                    r -= 1
                elif curr_sum < target:
                    l += 1
                else:
                    return curr_sum
        return closest_sum                        
