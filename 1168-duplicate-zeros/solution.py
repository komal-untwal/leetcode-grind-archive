class Solution(object):
    def duplicateZeros(self, arr):
        """
        :type arr: List[int]
        :rtype: None Do not return anything, modify arr in-place instead.
        """
        dup_zeros = 0
        length = len(arr)-1
        
        for i in range(length + 1):
            if i > length - dup_zeros:
                break
            if arr[i] == 0:
                if i == length - dup_zeros:
                    arr[length] = 0
                    length -= 1
                    break
                dup_zeros += 1
                
        last = length - dup_zeros
        
        for j in range(last,-1,-1):
            if arr[j] == 0:
                arr[j + dup_zeros] = 0
                dup_zeros -= 1
                arr[j + dup_zeros] = 0
            else:
                arr[j + dup_zeros] = arr[j]
