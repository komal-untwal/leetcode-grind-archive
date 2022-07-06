class Solution(object):
    def fourSumCount(self, nums1, nums2, nums3, nums4):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :type nums3: List[int]
        :type nums4: List[int]
        :rtype: int
        """
        dict_1, dict_2 = dict(Counter(nums1)), dict(Counter(nums2))
        dict_3, dict_4 = dict(Counter(nums3)), dict(Counter(nums4))
        def get_2_dict(dict_1, dict_2):
            dict_12 = dict()
            for k1 in dict_1:
                for k2 in dict_2:
                    Sum = k1 + k2
                    if Sum not in dict_12:
                        dict_12[Sum] = dict_1[k1]*dict_2[k2]
                    else:
                        dict_12[Sum] += dict_1[k1]*dict_2[k2]
            return(dict_12)
        dict_12 = get_2_dict(dict_1, dict_2)
        dict_34 = get_2_dict(dict_3, dict_4)
        
        res = 0
        for k in dict_12:
            if -1*k in dict_34:
                res += dict_12[k]*dict_34[-1*k]
        return(res)        
