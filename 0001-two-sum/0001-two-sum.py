class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        store = {}
        for index, values in enumerate(nums):
            diff = target - values
            if diff in store:
                return [index, store[diff]]
            store[values] = index
        
        return [-1, -1]


        