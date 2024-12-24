class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        prev_map = {}
        res = []

        for i,n in enumerate(numbers):
            diff = target - n
            if diff in prev_map:
                return [prev_map[diff] + 1, i+1]
            prev_map[n] = i
        return      
